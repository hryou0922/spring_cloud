package com.hry.spring.cloud.consumer.hystrix.feign.client;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@Component
public class MyHystrixClientFallbackFactory implements FallbackFactory<IMyHystrixClient> {

    @Override
    public IMyHystrixClient create(Throwable throwable) {
        return new IMyHystrixClient() {
            @Override
            public String simpleHystrixClientCall(long time) {
                return "Execute raw fallback: access service fail , req= " + time + " reason = " + throwable;
            }
        };
    }
}
