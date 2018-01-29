/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Controller Class with Request Mapping configuration
*/
package io.acube.security.acubesecurityclient.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user/me")
public class UserResource {
	@Autowired
	RestTemplate restTemplate;

	/*
	 * This method authenticates the loggedin user and gets userdetails based on userName
	 */
	@GetMapping
	public String getUserProfile() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String userName = auth.getPrincipal().toString();
		String data =  restTemplate.getForObject("http://localhost:8300/api/db-service/rest/db/" + userName, String.class);
		return   data;
	}
}
