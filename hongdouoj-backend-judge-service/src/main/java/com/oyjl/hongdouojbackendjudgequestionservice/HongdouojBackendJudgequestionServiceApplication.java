package com.oyjl.hongdouojbackendjudgequestionservice;

import com.oyjl.hongdouojbackendjudgequestionservice.rabbitmq.InitRabbitMq;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.oyjl")//因为不再一个服务下，而需要扫描com.oyjl下的全局异常处理器的类，就定义扫描com.oyjl包下的所有类
@EnableDiscoveryClient
@EnableFeignClients("com.oyjl.hongdouojbackendserviceclient.service")
@SpringBootApplication
public class HongdouojBackendJudgequestionServiceApplication {

    public static void main(String[] args) {
        InitRabbitMq.doInit();
        SpringApplication.run(HongdouojBackendJudgequestionServiceApplication.class, args);
    }

}
