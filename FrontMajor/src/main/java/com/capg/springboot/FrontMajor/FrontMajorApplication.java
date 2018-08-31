package com.capg.springboot.FrontMajor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.capg.springboot.FrontMajor")
public class FrontMajorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrontMajorApplication.class, args);
	}
}
