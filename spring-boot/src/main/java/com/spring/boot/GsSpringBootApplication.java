package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class GsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsSpringBootApplication.class, args);
		System.out.println("Let's inspect the beans provided by Spring Boot:");

	}

}
