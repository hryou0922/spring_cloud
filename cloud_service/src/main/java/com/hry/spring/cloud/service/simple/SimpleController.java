package com.hry.spring.cloud.service.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	@Autowired
	private SimpleConfig simpleConfig; // 
	
    @RequestMapping(value = "/simple")
    public String simple() {   
        return "simple" + simpleConfig;
    }
}
