package com.hry.spring.cloud.service.simple;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
    @RequestMapping(value = "/simple")
    String simple() {   
        return "simple";
    }
}
