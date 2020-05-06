package com.cgf.eurekaclientconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient //启用EurekaClient组件
@EnableFeignClients  //开启Feign的功能
public class EurekaClientConsumerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerFeignApplication.class, args);
    }

}
