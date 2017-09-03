package com.hry.spring.cloud.service.simple2.dto;

public class SimpleDto {
	private String id;
	private Integer code;
	private String errorMsg;
	private String name;
	private Integer age;
	private Integer randomNum;
	private String transparentString;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getTransparentString() {
		return transparentString;
	}
	public void setTransparentString(String transparentString) {
		this.transparentString = transparentString;
	}
	public Integer getRandomNum() {
		return randomNum;
	}
	public void setRandomNum(Integer randomNum) {
		this.randomNum = randomNum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	
}
