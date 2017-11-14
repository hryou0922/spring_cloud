package com.hry.spring.cloud.consumer.hystrix.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@FeignClient(name="cloud-hystrix-service"
        , fallbackFactory = MyHystrixClientFallbackFactory.class )
public interface IMyHystrixClient {
    @RequestMapping(value = "/hystrix/simple", method = RequestMethod.POST, consumes="application/json; charset=UTF-8")
    String simpleHystrixClientCall(@RequestParam("time") long time);
}
