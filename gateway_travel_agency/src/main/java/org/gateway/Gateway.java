package org.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import reactor.core.publisher.Hooks;

@SpringBootApplication
@EnableDiscoveryClient
public class Gateway {

	public static void main(String[] args) {
		Hooks.enableAutomaticContextPropagation();
		SpringApplication.run(Gateway.class, args);
	}	
}
