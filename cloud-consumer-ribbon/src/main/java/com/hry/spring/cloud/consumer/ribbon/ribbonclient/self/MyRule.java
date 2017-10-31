package com.hry.spring.cloud.consumer.ribbon.ribbonclient.self;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RoundRobinRule;
import com.netflix.loadbalancer.Server;

public class MyRule extends RoundRobinRule {

    @Override
    public Server choose(Object key) {
        System.out.println("MyRule choose " + key + " ... ");
        return super.choose(key);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        System.out.println("MyRule - setLoadBalancer  ... ");
        super.setLoadBalancer(lb);
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        System.out.println("MyRule - getLoadBalancer  ... ");
        return super.getLoadBalancer();
    }
}
