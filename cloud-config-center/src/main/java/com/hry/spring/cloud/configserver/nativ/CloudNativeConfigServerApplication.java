package com.hry.spring.cloud.configserver.nativ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudNativeConfigServerApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=native";
		SpringApplication.run(CloudNativeConfigServerApplication.class, args);
	}
}