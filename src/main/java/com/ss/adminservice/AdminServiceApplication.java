package com.ss.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AdminServiceApplication {

	public static void main(String[] args)
	{
		new SpringApplicationBuilder()
				.profiles("dev")
				.sources(AdminServiceApplication.class)
				.run(args);
	}
}
