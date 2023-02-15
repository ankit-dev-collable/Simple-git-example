package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleGitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleGitExampleApplication.class, args);
		System.out.println("code changes in main branch for project");

	}

}
