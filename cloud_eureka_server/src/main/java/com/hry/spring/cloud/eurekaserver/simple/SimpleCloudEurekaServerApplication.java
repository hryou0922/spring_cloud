package com.hry.spring.cloud.eurekaserver.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册管理器（eureka服务器）
 * 	EurekaClientConfigBean
 * 	查看当前注册的服务：http://localhost:8761/
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