package com.cg.userprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;*/

@SpringBootApplication
public class UserProfileApp {
	public static void main(String[] args) {
		SpringApplication.run(UserProfileApp.class, args);
		System.out.println("Welcome to User API");
	}
	
	/*@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.any()) 
          .paths(PathSelectors.any())                          
          .build()
          .pathMapping("/");                                           
    } */
}
