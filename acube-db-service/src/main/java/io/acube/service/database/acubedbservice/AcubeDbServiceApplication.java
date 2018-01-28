/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Class with main method to execute application
*/
package io.acube.service.database.acubedbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages="io.acube.service.database.acubedbservice.repository")
@SpringBootApplication
public class AcubeDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcubeDbServiceApplication.class, args);
	}
}
