/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Service Class to get the User data
*/
package io.acube.security.acubesecurityauthserver.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import io.acube.security.acubesecurityauthserver.model.CustomUserDetail;
import io.acube.security.acubesecurityauthserver.model.Users;
import io.acube.security.acubesecurityauthserver.repository.UsersRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired
	private UsersRepository userRepository;

	/*
	 * Method to get the UserDetails by Username
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Users> optionalUser =  userRepository.findByusername(username);
		optionalUser.orElseThrow(()-> new UsernameNotFoundException("Cannot find user " + username));
		return optionalUser.map(CustomUserDetail::new).get();
	}

}
