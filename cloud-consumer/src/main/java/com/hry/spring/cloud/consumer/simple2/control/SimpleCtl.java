package com.hry.spring.cloud.consumer.simple2.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hry.spring.cloud.consumer.simple2.service.SimpleService;

@RestController
public class SimpleCtl {
	
	@Autowired
	private SimpleService simpleService;
	
	@RequestMapping(value="/simpleClientCall")
    public String simpleClientCall(){
		return simpleService.call();
    }
}
