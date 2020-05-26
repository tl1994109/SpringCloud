package com.example.springbooteurekaclientconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
@EnableFeignClients(basePackages = {"com.example.*"})
public class SpringbootEurekaClientConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaClientConsumerApplication.class, args);
    }

}
