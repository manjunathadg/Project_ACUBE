/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Class with main method to execute ZuulProxy enabled Spring Boot Application
*/
package io.acube.service.zuul.acubezuulservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class AcubeZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcubeZuulServiceApplication.class, args);
	}
}
