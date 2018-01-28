/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Class to start the User Service Application
*/
package io.acube.service.user.acubeuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class AcubeUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcubeUserServiceApplication.class, args);
	}
}
