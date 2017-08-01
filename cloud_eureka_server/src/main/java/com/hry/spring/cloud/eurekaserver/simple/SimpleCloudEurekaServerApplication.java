package com.hry.spring.cloud.eurekaserver.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册管理器（eureka服务器）
 * 	EurekaClientConfigBean
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class SimpleCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleCloudEurekaServerApplication.class, args);
	}
}