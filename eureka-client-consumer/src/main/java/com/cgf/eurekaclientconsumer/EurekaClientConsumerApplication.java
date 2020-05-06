package com.cgf.eurekaclientconsumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix  //启用hystrix
public class EurekaClientConsumerApplication {

    public static void main(String[] args) {

        SpringApplication.run(EurekaClientConsumerApplication.class, args);
    }

    /**
     * springcloud中提倡rest风格的微服务
     * 向spring容器中注入RestTemplate
     *
     * 使用LoadBalanced表明这个restRemplate开启负载均衡的功能。
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
