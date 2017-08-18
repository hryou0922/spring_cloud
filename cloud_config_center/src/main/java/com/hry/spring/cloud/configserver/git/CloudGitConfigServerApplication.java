package com.hry.spring.cloud.configserver.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudGitConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudGitConfigServerApplication.class, args);
	}
}