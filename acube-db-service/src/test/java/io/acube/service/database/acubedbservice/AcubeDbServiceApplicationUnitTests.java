package io.acube.service.database.acubedbservice;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.RequestBuilder;
import org.skyscreamer.jsonassert.JSONAssert;

import io.acube.service.database.acubedbservice.model.User;
import io.acube.service.database.acubedbservice.repository.UserRepository;
import io.acube.service.database.acubedbservice.resource.DBServiceResource;

public class AcubeDbServiceApplicationUnitTests extends AcubeDbServiceApplicationTests {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	@MockBean
	UserRepository userRepository;
	
	@Autowired
	DBServiceResource dbServiceResource;
	
	private MockMvc mockMvc;
	private User user;
	private String userName = "rahulk"; 
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
		user = new User();
		user.setUserName("rahulk");
		user.setFirst_name("Rahul");
		user.setLast_name("kumar");
	}
	
	@Test
	public void testGetUser() throws Exception {
		mockMvc.perform(get("/rest/db/pete")).andExpect(status().isOk());
	}
	
	@Test
	public void testFindByUser() throws Exception {
		Mockito.when(dbServiceResource.getUser(Mockito.anyString())).thenReturn(user);	
	
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/rest/db/rahulk").accept(
				MediaType.APPLICATION_JSON);
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		System.out.println("MVC Result : "+result.getResponse());
		String expected = "{\"userName\":\"rahulk\",\"first_name\":\"Rahul\",\"last_name\":\"kumar\"}";
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}

}
