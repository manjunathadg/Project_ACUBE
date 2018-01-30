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
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.filter.ForwardedHeaderFilter;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
@EnableWebSecurity
@EnableEurekaClient
public class AcubeSecurityAuthServerApplication extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(AcubeSecurityAuthServerApplication.class, args);
	}
	
	 @Bean
	    FilterRegistrationBean forwardedHeaderFilter() {
	        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
	        filterRegBean.setFilter(new ForwardedHeaderFilter());
	        filterRegBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
	        return filterRegBean;
	    }

	    @Override
	    public void addViewControllers(ViewControllerRegistry registry) {
	        registry.addViewController("/login").setViewName("login");
	        registry.addViewController("/oauth/confirm_access").setViewName("authorize");
	    }


}
