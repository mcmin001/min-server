package com.mcmin.server.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mcmin")
public class MinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinServerApplication.class, args);
	}

}
