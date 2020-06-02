package com.example.springbootzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class SpringbootZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootZuulApplication.class, args);
    }

}
