package io.acube.service.database.acubedbservice;

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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AcubeDbServiceApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AcubeDbServiceApplicationIntegrationTests {
	
	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders headers = new HttpHeaders();
	
	@Test
	public void testGetUser() throws Exception {
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		
		
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/rest/db/manjudg"),
				HttpMethod.GET, entity, String.class);
		
		String expected = "{\"userName\":\"manjudg\",\"first_name\":\"Manjunath\",\"last_name\":\"Gopalapura\"}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}
	
	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}
