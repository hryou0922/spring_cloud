package com.hry.spring.cloud.consumer.ribbon.ribbonclient.self;

import com.netflix.client.config.IClientConfig;
import com.netflix.discovery.EurekaClient;
import com.netflix.niws.loadbalancer.DiscoveryEnabledNIWSServerList;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;

import java.util.List;

public class MyDiscoveryEnabledNIWSServerList extends DiscoveryEnabledNIWSServerList {

    public List<DiscoveryEnabledServer> getInitialListOfServers() {
        System.out.println("MyDiscoveryEnabledNIWSServerList getInitialListOfServers  ... ");
        return super.getInitialListOfServers();
    }

    @Override
    public List<DiscoveryEnabledServer> getUpdatedListOfServers(){
        System.out.println("MyDiscoveryEnabledNIWSServerList getUpdatedListOfServers  ... ");
        return super.getUpdatedListOfServers();
    }
}
