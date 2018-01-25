package com.capgemini.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author dimehta
 *
 */
@EnableDiscoveryClient
@ServletComponentScan
@ComponentScan({"com.capgemini.serviceimpl","com.capgemini.config","com.capgemini.login.social.providers"})
@SpringBootApplication
public class OnlineShopingApplication extends SpringBootServletInitializer {
	private static final Logger logger = LoggerFactory.getLogger(OnlineShopingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(OnlineShopingApplication.class, args);
		logger.info("Main call");
		
	}
}
