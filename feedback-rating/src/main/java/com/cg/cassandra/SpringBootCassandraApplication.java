package com.cg.cassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@ComponentScan
@Configuration
@EnableSwagger2
@SpringBootApplication
public class SpringBootCassandraApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
		System.out.println("============================================");

	}
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.cg.cassandra")).paths(PathSelectors.any()).build();

	}

}
