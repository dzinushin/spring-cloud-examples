package com.example.sgwdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SgwDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgwDemoApplication.class, args);
	}

	@Bean
	public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder) {
		return routeLocatorBuilder.routes()
				.route("route1", r -> {
					return r.path("/local/get/**")
							.filters(f -> f.addRequestHeader("header1", "header-value-1")
									.rewritePath("/local/(?<segment>.*)", "/${segment}")
									)
							.uri("http://localhost:8080");
				})
				.route("route2", r -> {
					return r.path("/widget-statistics/**")
							.filters(f -> f.rewritePath("/widget-statistics/(?<segment>.*)", "/${segment}"))
							.uri("http://localhost:3000");
				})
				.build();
	}
}
