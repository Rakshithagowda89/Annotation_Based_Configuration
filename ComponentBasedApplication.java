package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //@Configuration ,@ EnableAutoCofiguration,@ComponentScan
public class ComponentBasedApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(ComponentBasedApplication.class, args);
		Home h=context.getBean(Home.class);
		h.connect();
		
	}

}
