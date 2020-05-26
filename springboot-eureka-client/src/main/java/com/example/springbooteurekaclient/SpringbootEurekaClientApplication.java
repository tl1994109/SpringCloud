package com.example.springbooteurekaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaClientApplication.class, args);
    }

}
