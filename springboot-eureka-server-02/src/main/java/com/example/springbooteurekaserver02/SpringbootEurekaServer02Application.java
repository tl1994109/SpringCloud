package com.example.springbooteurekaserver02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootEurekaServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEurekaServer02Application.class, args);
    }

}
