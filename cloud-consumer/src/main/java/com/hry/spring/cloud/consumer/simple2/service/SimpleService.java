package com.hry.spring.cloud.consumer.simple2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class SimpleService {
	private static final Logger logger = LoggerFactory.getLogger(SimpleService.class);
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${service.url}")
	private String serviceUrl;

	@HystrixCommand(fallbackMethod = "fallback")
	public String call() {
		return restTemplate.getForObject(serviceUrl, String.class);
	}   

	private String fallback() {
		logger.error("HystrixCommand fallbackMethod handle!");
        return "访问服务失败";
	}

}
