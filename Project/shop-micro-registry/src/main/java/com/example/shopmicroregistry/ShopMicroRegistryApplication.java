package com.example.shopmicroregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EnableEurekaServer
public class ShopMicroRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopMicroRegistryApplication.class, args);
	}

}
