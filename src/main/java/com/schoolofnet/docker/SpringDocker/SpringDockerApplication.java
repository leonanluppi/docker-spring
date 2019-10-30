package com.schoolofnet.docker.SpringDocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class SpringDockerApplication {

	
	@RequestMapping("/")
	public String hello() {
		return "Hello from Docker";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDockerApplication.class, args);
	}

}
