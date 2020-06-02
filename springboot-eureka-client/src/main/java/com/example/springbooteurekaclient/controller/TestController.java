package com.example.springbooteurekaclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value="test")
@RestController
public class TestController {




    @Value("${server.port}")
    private  String port;

    @GetMapping("hello")
    public  String hello(){

        return "hello"+"-----"+port;
    }
}
