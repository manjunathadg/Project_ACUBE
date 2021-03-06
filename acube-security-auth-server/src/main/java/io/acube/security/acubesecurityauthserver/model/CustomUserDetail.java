/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Model class that handles Authorization
*/
package io.acube.security.acubesecurityauthserver.model;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetail extends Users implements UserDetails {

	public CustomUserDetail(final Users users) {
		super(users);
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return super.getRoles().stream().map(role -> new SimpleGrantedAuthority(role.getName()))
				.collect(Collectors.toList());
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		return super.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
