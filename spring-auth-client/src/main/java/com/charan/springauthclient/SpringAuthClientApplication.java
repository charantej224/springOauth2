package com.charan.springauthclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.charan.*")
public class SpringAuthClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthClientApplication.class, args);
	}
}
