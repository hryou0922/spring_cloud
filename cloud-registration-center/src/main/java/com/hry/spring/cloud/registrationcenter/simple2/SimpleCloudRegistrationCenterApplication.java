package com.hry.spring.cloud.registrationcenter.simple2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 * 	EurekaClientConfigBean
 * 	查看当前注册的服务：http://localhost:8761/
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SimpleCloudRegistrationCenterApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=simple2";
		SpringApplication.run(SimpleCloudRegistrationCenterApplication.class, args);
	}

}