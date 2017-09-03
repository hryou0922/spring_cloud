package com.hry.spring.cloud.consumer2.simple.control;

import com.hry.spring.cloud.consumer2.simple.dto.SimpleDto;
import com.hry.spring.cloud.consumer2.simple.dto.SimpleQry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hry.spring.cloud.consumer2.simple.service.ISimpleClient;

@RestController
public class SimpleCtl {
	
	@Autowired
	private ISimpleClient feignClient;
	
	@RequestMapping(value="/feign-client-call")
    public String simpleClientCall(){
		return feignClient.call();
    }
	
	@RequestMapping(value="/feign-client-call/{transparentString}")
    public SimpleDto simpleWithOneParam(@PathVariable("transparentString") String transparentString){
		return feignClient.simpleWithOneParam(transparentString);
    }
	
	@RequestMapping(value="/feign-client-call-with-qry")
    public SimpleDto simpleWithQry(){
		SimpleQry qry = new SimpleQry();
		qry.setRandomNum(123456);
		qry.setTransparentString("transparentString");
		return feignClient.simpleWithQry(qry);
    }
}
