package com.cnuip2.mservice.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MserviceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MserviceRegistryApplication.class, args);
	}
}
