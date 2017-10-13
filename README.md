# 版本更新
- 20171013 [Spring cloud系列四 Eureka 之概述和服务注册中心集群](http://blog.csdn.net/hry2015/article/details/78220673)对应的git代码为[tagv0.4](https://github.com/hryou0922/spring_cloud/blob/v0.4/cloud-registration-center/src/main/resources/application-simple2.yml)
- 20170911 [Spring cloud系列三 Spring Cloud 配置中心集群](http://blog.csdn.net/hry2015/article/details/77938249)对应的git代码为[tagv0.3](https://github.com/hryou0922/spring_cloud/tree/v0.3)
- 20170906 [Spring cloud系列二 Spring Cloud 配置中心的基本用法](http://blog.csdn.net/hry2015/article/details/77870854)对应的git代码为[tagsv0.2](https://github.com/hryou0922/spring_cloud/tree/v0.2)
- 20170827 [Spring cloud系列一 包含所有基本要素的完整Spring Cloud demo](http://blog.csdn.net/hry2015/article/details/77623366) 对应的git代码为[tagsv0.1](https://github.com/hryou0922/spring_cloud/tree/v0.1)

# 简单的demo
介绍springcloud用法 
- cloud-parent
定义公共的POM.XML
- cloud-config-git
存储配置文件，用于配置中心通过git方式读取数据

# cloud-config-center
配置服务中心：提供公共配置读取服务

默认地址：
- 返回服务器的环境变量：http://127.0.0.1:10888/env
- 查看服务器的信息：http://127.0.0.1:10888/health
- 返回所有的当前线程：http://127.0.0.1:10888/dump

查看Native配置
- http://127.0.0.1:10888/cloud-config-dev.properties
- http://127.0.0.1:10888/cloud-config-test.properties


# cloud-registration-center
注册中心服务：提供服务的注册和发现
默认地址
- 当前服务注册的信息：http://127.0.0.1:10761/ 
- 服务信息：http://127.0.0.1:10761/health
- http://127.0.0.1:10761/info

# cloud-service
服务提供者
测试地址： 
- 无参请求：http://127.0.0.1:10082/simple
- 带单个参数请求：http://127.0.0.1:10082/simplewithoneparam/{transparentString}
- 带多个参数请求：http://127.0.0.1:10082//simplewithqry post

# cloud-consumer
服务消费者
测试地址： 
- 无参请求：http://127.0.0.1:10701/feign-client-call
- 带单个参数请求：http://127.0.0.1:10701/feign-client-call/transparentString
- 带多个参数请求：http://127.0.0.1:10701/feign-client-call-with-qry


