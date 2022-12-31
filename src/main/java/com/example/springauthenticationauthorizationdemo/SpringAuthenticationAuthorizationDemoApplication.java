package com.example.springauthenticationauthorizationdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@SpringBootApplication
public class SpringAuthenticationAuthorizationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAuthenticationAuthorizationDemoApplication.class, args);
	}

}
