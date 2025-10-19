package com.aws.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CicdApplication {

	public static void main(String[] args) {
		SpringApplication.run(CicdApplication.class, args);
	}

	@GetMapping("/first")
	public String firstDeployment(){
		return "This is my first commit to GitHub ";
	}

	@GetMapping("/second")
	public String secondDeployment(){
		return "This is my Second commit to GitHub ";
	}


	@GetMapping
	public String welcome(){
		return "Welcome to CICD demo app";
	}

}
