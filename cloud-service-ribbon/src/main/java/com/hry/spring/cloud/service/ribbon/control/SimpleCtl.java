package com.hry.spring.cloud.service.ribbon.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SimpleCtl {
    private AtomicInteger count = new AtomicInteger();
    private AtomicInteger sleepCount = new AtomicInteger();

	@RequestMapping(value="/ribbon/simple")
    public String ribbonClientCall(){
	    int newCount = count.incrementAndGet();
		return "ribbon" + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
    }

    @RequestMapping(value="/ribbon/sleep")
    public String ribbonClientCallSleep(){
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int newCount = sleepCount.incrementAndGet();
        return "ribbon sleep " + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
    }

}
