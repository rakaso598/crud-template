package com.example.crudtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})

public class CrudtemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudtemplateApplication.class, args);
	}

}
