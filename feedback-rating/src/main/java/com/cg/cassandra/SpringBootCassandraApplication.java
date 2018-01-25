package com.cg.cassandra;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Component;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringBootCassandraApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootCassandraApplication.class, args);
	}

}

@Component
class CLRunner implements CommandLineRunner {
	@Override
	public void run(String... args) throws Exception {
		System.err.println("came to clr");
		
	}
}
