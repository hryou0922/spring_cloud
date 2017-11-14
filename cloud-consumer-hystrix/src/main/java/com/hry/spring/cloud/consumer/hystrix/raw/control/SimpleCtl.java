package com.hry.spring.cloud.consumer.hystrix.raw.control;

import com.hry.spring.cloud.consumer.hystrix.raw.client.MyHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@RestController
public class SimpleCtl {
    @Autowired
    private MyHystrixClient myHystrixClient;

    @RequestMapping(value="/hystrix/simple")
    public String simpleClientCall(){
        return "rsp: " + myHystrixClient.simpleHystrixClientCall(System.currentTimeMillis());
    }

}
