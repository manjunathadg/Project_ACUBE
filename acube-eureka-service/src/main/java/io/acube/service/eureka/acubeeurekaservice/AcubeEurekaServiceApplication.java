/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Class to start the Eureka server
*/
package io.acube.service.eureka.acubeeurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class AcubeEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcubeEurekaServiceApplication.class, args);
	}
}
