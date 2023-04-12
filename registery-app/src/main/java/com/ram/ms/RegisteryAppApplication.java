package com.ram.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegisteryAppApplication {

	public static void main(String[] args) {
//	    System.setProperty("server.servlet.context-path", "/registery");
		SpringApplication.run(RegisteryAppApplication.class, args);
	}

}
