package com.oyjl.hongdouojbackenduserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 *
 * @author <a href="https://github.com/liyupi">程序员红逗</a>
 * @from <a href="https://gitee.com/ouyang-jianli">gitee</a>
 */
@MapperScan("com.oyjl.hongdouojbackenduserservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.oyjl")//因为不再一个服务下，而需要扫描com.oyjl下的全局异常处理器的类，就定义扫描com.oyjl包下的所有类
@EnableDiscoveryClient
@EnableFeignClients("com.oyjl.hongdouojbackendserviceclient.service")
@SpringBootApplication
public class HongdouojBackendUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HongdouojBackendUserServiceApplication.class, args);
    }

}
