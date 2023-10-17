package com.microservice.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroserviceUerekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceUerekaApplication.class, args);
	}

}
