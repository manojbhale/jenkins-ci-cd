package com.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsCiCdApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsCiCdApplication.class, args);
		System.out.println("Spring Boot Application started");
	}

}
