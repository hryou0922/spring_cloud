package com.hry.spring.cloud.consumer.zipkin.control;


import com.hry.spring.cloud.consumer.zipkin.feign.IRibbonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleCtl {

    @Autowired
    private IRibbonClient ribbonClient;

	@RequestMapping(value="/zipkin/simple")
    public String simpleClientCall(){
		return "rsp: " + ribbonClient.ribbonClientCall();
    }

    @RequestMapping(value="/zipkin/sleep")
    public String simpleClientCallSleep(){
        return "sleep rsp: " + ribbonClient.ribbonClientCallSleep();
    }
}
