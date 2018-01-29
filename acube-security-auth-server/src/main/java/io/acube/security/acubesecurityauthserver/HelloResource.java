/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Rest Controller Class with request mapping
*/
package io.acube.security.acubesecurityauthserver;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/hello")
public class HelloResource {
	
	/*
	 * Mapping to get the logged in user detail
	 */
	@GetMapping("/principal")
	public Principal user(Principal principal) {
		return principal;
	}	
}
