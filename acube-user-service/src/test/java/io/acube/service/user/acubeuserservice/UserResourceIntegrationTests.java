package io.acube.service.user.acubeuserservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import io.acube.service.user.acubeuserservice.AcubeUserServiceApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AcubeUserServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserResourceIntegrationTests {

	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
	@Test
	public void testGetUserProfile() throws Exception {
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/manjudg"),
				HttpMethod.GET, entity, String.class);		
		
		String errorMessage = "{\"error\":\"unauthorized\",\"error_description\":\"Full authentication is required to access this resource\"}";
		JSONAssert.assertEquals(errorMessage, response.getBody(), false);
	}
		
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
	
}
