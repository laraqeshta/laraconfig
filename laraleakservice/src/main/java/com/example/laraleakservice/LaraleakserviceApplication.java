package com.example.laraleakservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class LaraleakserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaraleakserviceApplication.class, args);
	}

}
