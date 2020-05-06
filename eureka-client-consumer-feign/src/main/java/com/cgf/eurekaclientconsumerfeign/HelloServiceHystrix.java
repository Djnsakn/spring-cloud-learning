package com.cgf.eurekaclientconsumerfeign;

import org.springframework.stereotype.Component;

/**
 * Hystrix的fallback配置
 * 自定义的hystrix的fallback实现
 */
@Component
public class HelloServiceHystrix implements HelloService {

    /**
     * 这里方法声明要与HelloService中的一致
     * @param name
     * @return
     */
    @Override
    public String hi(String name) {
        return " fall back. " + name;
    }
}
