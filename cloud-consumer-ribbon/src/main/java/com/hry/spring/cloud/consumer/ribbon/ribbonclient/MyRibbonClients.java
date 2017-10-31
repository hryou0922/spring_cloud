package com.hry.spring.cloud.consumer.ribbon.ribbonclient;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;

// 所有ribbon的ribbon客户使用相同配置
// @RibbonClients(defaultConfiguration = MyDefaultRibbonConfig.class)
// 只有名为foo的ribbon客户使用指定的配置
/**
 * 如果使用@RibbonClient，则MyDefaultRibbonConfig必须使用@Configuration 注解。但是MyDefaultRibbonConfig不能
 * 被@ComponentScan扫描掉，否则MyDefaultRibbonConfig会被所有@RibbonClients共享
 *
 * The MyDefaultRibbonConfig has to be @Configuration but take care that it is not in a @ComponentScan
 * for the main application context, otherwise it will be shared by all the @RibbonClients.
 * If you use @ComponentScan (or @SpringBootApplication) you need to take steps to
 * avoid it being included (for instance put it in a separate, non-overlapping package,
 * or specify the packages to scan explicitly in the @ComponentScan).
 *
 */
@RibbonClient(name = "foo", configuration = MyDefaultRibbonConfig.class)
public class MyRibbonClients {

}

