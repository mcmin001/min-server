package com.mcmin.server.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.mcmin")
@EntityScan("com.mcmin.server.model")
@EnableJpaRepositories(basePackages = "com.mcmin.server.dao")
public class MinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinServerApplication.class, args);
	}

}
