package com.shair13.gateway_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApiApplication.class, args);
	}
//
//	@Bean
//	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
//		return builder.routes().build();
//	}
}
