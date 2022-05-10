package com.spring.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApplicationWsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringApplicationWsApplication.class, args);
		System.out.println("Application is running");
	}

}
