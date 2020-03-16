package com.guanqing.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class SbDemo04AdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbDemo04AdminServerApplication.class, args);
	}

}
