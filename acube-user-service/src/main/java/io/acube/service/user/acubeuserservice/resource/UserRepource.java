/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Controller class to map the endPoint requests
*/
package io.acube.service.user.acubeuserservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/user")
public class UserRepource {
	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/{username}")
	public String getUserProfile(@PathVariable(name = "username") final String username) {
		String data =  restTemplate.getForObject("http://db-service/rest/db/"+username, String.class);
		return data;
	}
}
