package com.youbin.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.youbin.springboot.service.HelloService;

/**
 * @program: springboot-demo
 * @description:
 * @author: Mr.You
 * @create: 2019-03-14 20:24
 **/
@Configuration
public class MyConfig {

    @Bean
    public HelloService helloService(){
        System.out.println("配置HelloService注解.....");
        return new HelloService();
    }
}
