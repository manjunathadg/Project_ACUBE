package io.acube.security.acubesecurityauthserver.service;

import static org.junit.Assert.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.acube.security.acubesecurityauthserver.AcubeSecurityAuthServerApplicationTests;

import io.acube.security.acubesecurityauthserver.model.CustomUserDetail;
import io.acube.security.acubesecurityauthserver.model.Users;


public class CustomUserDetailsServiceUnitTests extends AcubeSecurityAuthServerApplicationTests {
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	private CustomUserDetail customUserDetail;
	private Users user;
	private String userName = "rahulk";
	
	@Autowired
	CustomUserDetailsService customUserDetailsService;	
	
	
	@Before
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();	
		user = new Users();
		user.setUsername("rahulk");
		user.setFirst_name("Rahul");
		user.setLast_name("Kumar");
		customUserDetail = new CustomUserDetail(user);
		
	}
	
	@Test(expected=UsernameNotFoundException.class)
	public void testLoadUserByUserName() throws Exception {			
		customUserDetailsService.loadUserByUsername(userName);		
	}

}
