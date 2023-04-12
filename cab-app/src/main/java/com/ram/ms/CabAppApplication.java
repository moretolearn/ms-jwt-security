package com.ram.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CabAppApplication {
		
	public static void main(String[] args) {
	    System.setProperty("server.servlet.context-path", "/cab");
		SpringApplication.run(CabAppApplication.class, args);
	}

}
