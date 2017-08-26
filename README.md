# spring_cloud
介绍springcloud用法 
# cloud-parent
定义公共的POM.XML
    
# cloud-config-git
存储配置文件，用于配置中心通过git方式读取数据

# cloud-config-center
配置服务中心：提供公共配置读取服务

默认地址：
- 返回服务器的环境变量：http://127.0.0.1:8888/env
- 查看服务器的信息：http://127.0.0.1:8888/health
- 返回所有的当前线程：http://127.0.0.1:8888/dump

查看Native配置
- http://127.0.0.1:8888/cloud-config-dev.properties
- http://127.0.0.1:8888/cloud-config-test.properties


# cloud-registration-center
注册中心服务：提供服务的注册和发现
默认地址
- 当前服务注册的信息：http://127.0.0.1:8761/; http://127.0.0.1:8761/lastn
- 服务信息：http://127.0.0.1:8761/health
- http://127.0.0.1:8761/info

# cloud-service
服务提供者
测试地址： 
- 无参请求：http://127.0.0.1:8082/simple
- 带单个参数请求：http://127.0.0.1:8082/simplewithoneparam/{transparentString}
- 带多个参数请求：http://127.0.0.1:8082//simplewithqry post

# cloud-consumer
服务消费者
测试地址： 
- 无参请求：http://127.0.0.1:8701/feign-client-call
- 带单个参数请求：http://127.0.0.1:8701/feign-client-call/transparentString
- 带多个参数请求：http://127.0.0.1:8701/feign-client-call-with-qry


