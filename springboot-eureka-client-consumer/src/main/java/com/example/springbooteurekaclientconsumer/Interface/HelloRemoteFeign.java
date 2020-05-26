package com.example.springbooteurekaclientconsumer.Interface;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="springboot-eureka-producer")
public interface HelloRemoteFeign {

    @GetMapping(value = "test/hello")
    String hello();
}
