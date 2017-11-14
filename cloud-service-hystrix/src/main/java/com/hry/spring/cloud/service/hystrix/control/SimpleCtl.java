package com.hry.spring.cloud.service.hystrix.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SimpleCtl {
    private AtomicInteger count = new AtomicInteger();
    private AtomicInteger sleepCount = new AtomicInteger();

	@RequestMapping(value="/hystrix/simple")
    public String hystrixClientCall(@RequestParam("time") long time){
	    int newCount = count.incrementAndGet();
		return "time " + time + " hystrix" + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
    }

    @RequestMapping(value="/hystrix/sleep")
    public String hystrixClientCallSleep(){
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int newCount = sleepCount.incrementAndGet();
        return "hystrix sleep " + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
    }

}
