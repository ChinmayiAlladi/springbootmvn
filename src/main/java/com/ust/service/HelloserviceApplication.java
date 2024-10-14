package com.ust.service;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class HelloserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloserviceApplication.class, args);
	}

}
