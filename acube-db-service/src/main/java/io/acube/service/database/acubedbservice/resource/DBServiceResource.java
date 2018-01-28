/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Controller Class with request mapping
*/
package io.acube.service.database.acubedbservice.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.acube.service.database.acubedbservice.model.User;
import io.acube.service.database.acubedbservice.repository.UserRepository;

@RestController
@RequestMapping("/rest/db")
public class DBServiceResource {

	private UserRepository userRepository;

	public DBServiceResource(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	/*
	 * Method to get the User details based on the username passed
	 */
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") final String username) {
		User user = userRepository.findByUserName(username);
		return user;
	}

}
