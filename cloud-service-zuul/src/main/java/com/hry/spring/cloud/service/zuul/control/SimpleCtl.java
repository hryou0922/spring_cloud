package com.hry.spring.cloud.service.zuul.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class SimpleCtl {
    private AtomicInteger count = new AtomicInteger();
//    private AtomicInteger sleepCount = new AtomicInteger();

	@RequestMapping(value="/zuul-test/simple")
    public String zuulTestSimple(){
	    int newCount = count.incrementAndGet();
		return "zuul" + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
    }

    @RequestMapping(value="/zuul-test/source")
    public String zuulSourceIp(HttpServletRequest request){
        return "zuul req come from: " +   request.getHeader("X-FORWARDED-FOR") + "  " + ThreadLocalRandom.current().nextInt(1000);
    }

//
//    @RequestMapping(value="/zuul/sleep")
//    public String ribbonClientCallSleep(){
//        try {
//            Thread.sleep(1000 * 5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        int newCount = sleepCount.incrementAndGet();
//        return "ribbon sleep " + newCount + ": " + ThreadLocalRandom.current().nextInt(1000);
//    }

}
