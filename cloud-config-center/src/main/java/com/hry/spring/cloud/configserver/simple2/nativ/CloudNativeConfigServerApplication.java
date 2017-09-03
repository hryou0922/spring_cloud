package com.hry.spring.cloud.configserver.simple2.nativ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer // 激活该应用为配置文件服务器：读取远程配置文件，转换为rest接口服务
public class CloudNativeConfigServerApplication {

	public static void main(String[] args) {
		args = new String[1];
		// 使用native不可以使用spring.profiles.active的方式使用native模式
	//	args[0] = "--spring.profiles.active=nativesimple";
		args[0] = "--spring.config.name=application-nativesimple2";
		SpringApplication.run(CloudNativeConfigServerApplication.class, args);
	}
}