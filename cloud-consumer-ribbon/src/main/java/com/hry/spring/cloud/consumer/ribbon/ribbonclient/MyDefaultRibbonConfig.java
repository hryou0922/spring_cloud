package com.hry.spring.cloud.consumer.ribbon.ribbonclient;

import com.hry.spring.cloud.consumer.ribbon.ribbonclient.self.MyPingUrl;
import com.hry.spring.cloud.consumer.ribbon.ribbonclient.self.MyRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.niws.loadbalancer.NIWSDiscoveryPing;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyDefaultRibbonConfig {
//    @Bean
//    public IRule ribbonRule() {
//        return new MyRule();
//    }

    @Bean
    public IPing ribbonPing() {
        return new MyPingUrl(new NIWSDiscoveryPing());
    }

}
