package com.springexample22.springbootsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories	
public class SpringbootsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootsampleApplication.class, args);
	}
}
