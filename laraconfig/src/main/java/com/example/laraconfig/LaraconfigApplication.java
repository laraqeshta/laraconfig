package com.example.laraconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LaraconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaraconfigApplication.class, args);
	}

}
