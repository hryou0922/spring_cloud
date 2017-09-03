package com.hry.spring.cloud.service.simple2.service;

import java.util.Random;

import com.hry.spring.cloud.service.simple2.SimpleConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hry.spring.cloud.service.simple2.dto.SimpleDto;
import com.hry.spring.cloud.service.simple2.dto.SimpleQry;

@Service
public class SimpleService {
	@Autowired
	private SimpleConfig simpleConfig; //
	
	public SimpleDto simple(){
		SimpleDto simpleDto = new SimpleDto();
		simpleDto.setAge(simpleConfig.getAge());
		simpleDto.setName(simpleConfig.getName());
		simpleDto.setRandomNum(new Random().nextInt(1000));
		return simpleDto;
	}
	
	public SimpleDto simpleWithOneParam(String transparentString){
		SimpleDto simpleDto = new SimpleDto();
		simpleDto.setAge(simpleConfig.getAge());
		simpleDto.setName(simpleConfig.getName());
		simpleDto.setRandomNum(new Random().nextInt(1000));
		simpleDto.setTransparentString(transparentString);
		return simpleDto;
	}
	
	
	public SimpleDto simpleWithQry(SimpleQry qry){
		SimpleDto simpleDto = new SimpleDto();
		simpleDto.setAge(simpleConfig.getAge());
		simpleDto.setName(simpleConfig.getName());
		simpleDto.setRandomNum(qry.getRandomNum());
		simpleDto.setTransparentString(qry.getTransparentString());
		return simpleDto;
	}
	
}
