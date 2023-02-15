package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleGitExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleGitExampleApplication.class, args);

<<<<<<< HEAD
		System.out.println("code changes time 12-02-2023 at 16:05");

=======
		System.out.println("code changes at 16:03 in feature branch");
>>>>>>> refs/heads/feature

	}

}
