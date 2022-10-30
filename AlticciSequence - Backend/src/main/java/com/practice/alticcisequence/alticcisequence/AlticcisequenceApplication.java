package com.practice.alticcisequence.alticcisequence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class AlticcisequenceApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AlticcisequenceApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AlticcisequenceApplication.class);
	}

}
