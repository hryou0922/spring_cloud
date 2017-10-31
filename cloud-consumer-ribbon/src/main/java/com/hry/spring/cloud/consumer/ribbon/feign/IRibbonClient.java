package com.hry.spring.cloud.consumer.ribbon.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="cloud-ribbon-service")
public interface IRibbonClient {

    @RequestMapping(method = RequestMethod.GET, value = "/ribbon/simple")
    String ribbonClientCall();

    @RequestMapping(method = RequestMethod.GET, value="/ribbon/sleep")
    String ribbonClientCallSleep();
}