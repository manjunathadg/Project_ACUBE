/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Class with main method to execute application
*/
package io.acube.security.acubesecurityauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AcubeSecurityAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcubeSecurityAuthServerApplication.class, args);
	}
}
