package com.cg.springboot.MajorProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.springboot.MajorProject")
public class MajorProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MajorProjectApplication.class, args);
	}
}
