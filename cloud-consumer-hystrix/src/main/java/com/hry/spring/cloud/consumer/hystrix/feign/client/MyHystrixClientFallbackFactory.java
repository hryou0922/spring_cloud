package com.hry.spring.cloud.consumer.hystrix.feign.client;

import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by huangrongyou@yixin.im on 2017/11/13.
 */
@Component
public class MyHystrixClientFallbackFactory implements FallbackFactory<IMyHystrixClient> {
    private static final Logger log = LoggerFactory.getLogger(MyHystrixClientFallbackFactory.class);
    @Override
    public IMyHystrixClient create(Throwable throwable) {
        return new IMyHystrixClient() {
            @Override
            public String simpleHystrixClientCall(long time) {
                log.error("异常处理={}", throwable);
                return "Execute raw fallback: access service fail , req= " + time + " reason = " + throwable;
            }
        };
    }
}
