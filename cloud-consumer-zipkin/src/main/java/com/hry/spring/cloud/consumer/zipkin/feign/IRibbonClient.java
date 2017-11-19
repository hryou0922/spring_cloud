package com.hry.spring.cloud.consumer.zipkin.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cloud-zipkin-service")
public interface IRibbonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/zipkin/simple")
    String ribbonClientCall();

    @RequestMapping(method = RequestMethod.GET, value="/zipkin/sleep")
    String ribbonClientCallSleep();
}