package com.hry.spring.cloud.configserver.simple2.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
@EnableEurekaClient // 配置本应用将使用服务注册和服务发现
public class CloudGitConfigServerApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=gitsimple2";
		SpringApplication.run(CloudGitConfigServerApplication.class, args);
	}
}