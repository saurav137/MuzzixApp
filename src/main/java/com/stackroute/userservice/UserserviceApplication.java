package com.stackroute.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class UserserviceApplication extends SpringBootServletInitializer {



	public static void main(String[] args)throws Exception {
		SpringApplication.run(UserserviceApplication.class, args);
	}

}
