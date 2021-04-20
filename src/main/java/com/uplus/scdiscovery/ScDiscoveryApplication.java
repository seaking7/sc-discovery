package com.uplus.scdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScDiscoveryApplication.class, args);
	}

}
