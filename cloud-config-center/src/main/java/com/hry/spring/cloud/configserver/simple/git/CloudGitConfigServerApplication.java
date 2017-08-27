package com.hry.spring.cloud.configserver.simple.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
public class CloudGitConfigServerApplication {

	public static void main(String[] args) {
		args = new String[1];
		args[0] = "--spring.profiles.active=gitsimple";
		SpringApplication.run(CloudGitConfigServerApplication.class, args);
	}
}