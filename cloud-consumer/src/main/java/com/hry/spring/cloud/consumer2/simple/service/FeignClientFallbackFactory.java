package com.hry.spring.cloud.consumer2.simple.service;

import com.hry.spring.cloud.consumer2.simple.dto.SimpleDto;
import com.hry.spring.cloud.consumer2.simple.dto.SimpleQry;
import org.springframework.stereotype.Component;

import feign.hystrix.FallbackFactory;

/**
 * 如果要返回失败的原因
 * @author Administrator
 *
 */
@Component
public class FeignClientFallbackFactory implements FallbackFactory<ISimpleClient> {

	@Override
	public ISimpleClient create(Throwable arg0) {
		return new ISimpleClient() {
			@Override
			public String call() {
				arg0.printStackTrace();
				return "fail for " + arg0.getMessage();
			}

			@Override
			public SimpleDto simpleWithOneParam(String transparentString) {
				arg0.printStackTrace();
				SimpleDto dto = new SimpleDto();
				dto.setCode(-1);
				dto.setErrorMsg("access remote server error!" + arg0.getMessage());
				return dto;
			}

			@Override
			public SimpleDto simpleWithQry(SimpleQry qry) {
				arg0.printStackTrace();
				SimpleDto dto = new SimpleDto();
				dto.setCode(-1);
				dto.setErrorMsg("access remote server error!" + arg0.getMessage());
				return dto;
			}
		};
	}
}
