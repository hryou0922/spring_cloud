package com.hry.spring.cloud.consumer.feign.service;

import org.springframework.stereotype.Component;

import com.hry.spring.cloud.consumer.feign.dto.SimpleDto;
import com.hry.spring.cloud.consumer.feign.dto.SimpleQry;

@Component
public class FeignClientFallback implements IFeignClient{

	@Override
	public String call() {
		System.out.println(this);
		return "access remote server error!";
	}

	@Override
	public SimpleDto simpleWithOneParam(String transparentString) {
		SimpleDto dto = new SimpleDto();
		dto.setCode(-1);
		dto.setErrorMsg("access remote server error!");
		return dto;
	}

	@Override
	public SimpleDto simpleWithQry(SimpleQry qry) {
		SimpleDto dto = new SimpleDto();
		dto.setCode(-1);
		dto.setErrorMsg("access remote server error!");
		return dto;
	}

}
