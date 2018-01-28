/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* JUnit Test Class for AcubeDbServiceApplication 
*/
package io.acube.service.database.acubedbservice;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.acube.service.database.acubedbservice.model.User;
import io.acube.service.database.acubedbservice.resource.DBServiceResource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AcubeDbServiceApplicationTests {
	
	@Autowired
	private TestEntityManager testEntityManager;
	
	@Autowired
	private DBServiceResource dbServiceResource;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void testGetUser() {
		User user = new User();
		user.setUserName("markh");
		user.setFirst_name("Mark");
		user.setLast_name("Henry");
		testEntityManager.persist(user);
		testEntityManager.flush();
		
		User user2 = dbServiceResource.getUser(user.getUserName()) ;
		assertNotNull(user2);
		Assert.assertEquals(user.getUserName(), user2.getUserName());
	}

}
