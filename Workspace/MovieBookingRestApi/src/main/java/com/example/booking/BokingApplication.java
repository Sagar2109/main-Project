package com.example.booking;

import org.springframework.boot.SpringApplication;	
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching
public class BokingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BokingApplication.class, args);
		
	}
	
}
// response.setIntHeader("Refresh", 5);