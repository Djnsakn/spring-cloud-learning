package com.cgf.eurekaclientconsumerfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过FeignClient配置负载均衡，指定了服务提供者的名字
 * 这里直接写的是服务名: eureka-service-provider
 * 在ribbon中它会根据服务名来选择具体的服务实例，
 * 根据服务实例在请求的时候会用具体的url替换掉服务名
 */
@FeignClient("eureka-client-provider")
public interface HelloService {
    //这里指定调用的rest URL
    @RequestMapping(value = "/", method = RequestMethod.GET)
    String hi(@RequestParam(value = "name") String name);
}