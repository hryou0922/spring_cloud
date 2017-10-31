package com.hry.spring.cloud.consumer.ribbon.control;

import com.hry.spring.cloud.consumer.ribbon.feign.IRibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;

@RestController
public class SimpleCtl {

    @Autowired
    private IRibbonClient ribbonClient;

	@RequestMapping(value="/ribbon/simple")
    public String simpleClientCall(){
		return "rsp: " + ribbonClient.ribbonClientCall();
    }

    @RequestMapping(value="/ribbon/sleep")
    public String simpleClientCallSleep(){
        return "sleep rsp: " + ribbonClient.ribbonClientCallSleep();
    }
}
