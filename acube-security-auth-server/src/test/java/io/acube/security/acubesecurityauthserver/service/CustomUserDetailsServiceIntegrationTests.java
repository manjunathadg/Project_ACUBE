package io.acube.security.acubesecurityauthserver.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.junit4.SpringRunner;

import io.acube.security.acubesecurityauthserver.AcubeSecurityAuthServerApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AcubeSecurityAuthServerApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CustomUserDetailsServiceIntegrationTests {

	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;	
	
	@Test
	public void testLoadUserByUserName() throws Exception {
		String userName = "manjudg";
		UserDetails userDetails = customUserDetailsService.loadUserByUsername(userName);
		assertNotNull(userDetails);
	}
	
}
