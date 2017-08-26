package com.hry.spring.cloud.registrationcenter.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

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
		args[0] = "--spring.profiles.active=simple";
		SpringApplication.run(SimpleCloudRegistrationCenterApplication.class, args);
	}

}