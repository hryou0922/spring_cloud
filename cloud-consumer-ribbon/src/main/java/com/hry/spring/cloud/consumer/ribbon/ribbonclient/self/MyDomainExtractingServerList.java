package com.hry.spring.cloud.consumer.ribbon.ribbonclient.self;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.ServerList;
import com.netflix.niws.loadbalancer.DiscoveryEnabledServer;
import org.springframework.cloud.netflix.ribbon.eureka.DomainExtractingServerList;

import java.util.List;

public class MyDomainExtractingServerList extends DomainExtractingServerList {
    public MyDomainExtractingServerList(ServerList<DiscoveryEnabledServer> list, IClientConfig clientConfig, boolean approximateZoneFromHostname) {
        super(list, clientConfig, approximateZoneFromHostname);
    }

    @Override
    public List<DiscoveryEnabledServer> getInitialListOfServers() {
        System.out.println("MyDomainExtractingServerList getInitialListOfServers  ... ");
        return super.getInitialListOfServers();
    }

    @Override
    public List<DiscoveryEnabledServer> getUpdatedListOfServers() {
        System.out.println("MyDomainExtractingServerList getUpdatedListOfServers  ... ");
        return super.getUpdatedListOfServers();
    }
}
