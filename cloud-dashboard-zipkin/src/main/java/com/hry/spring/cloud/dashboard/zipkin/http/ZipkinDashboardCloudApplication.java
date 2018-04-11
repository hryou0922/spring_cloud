package com.hry.spring.cloud.dashboard.zipkin.http;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;


@EnableEurekaClient // 配置本应用将使用服务注册和服务发现
@SpringBootApplication
@EnableZipkinServer // 启动Zipkin服务
public class ZipkinDashboardCloudApplication {

    public static void main(String[] args) {
        args = new String[1];
        args[0] = "--spring.profiles.active=zipkin-http";
        SpringApplication.run(ZipkinDashboardCloudApplication.class, args);
    }

    /**
     * 使用fastjson做为json的解析器
     * @return
     */
//    @Bean
//    public HttpMessageConverters fastJsonHttpMessageConverters() {
//        FastJsonHttpMessageConverter fastConverter = new FastJsonHttpMessageConverter();
//        FastJsonConfig fastJsonConfig = new FastJsonConfig();
//        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//        fastConverter.setFastJsonConfig(fastJsonConfig);
//        HttpMessageConverter<?> converter = fastConverter;
//        return new HttpMessageConverters(converter);
//    }
}
