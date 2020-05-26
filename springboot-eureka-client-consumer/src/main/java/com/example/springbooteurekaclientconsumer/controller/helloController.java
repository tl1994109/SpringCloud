package com.example.springbooteurekaclientconsumer.controller;


import com.example.springbooteurekaclientconsumer.Interface.HelloRemoteFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="hello")
public class helloController {


    @Autowired
    private HelloRemoteFeign helloRemoteFeign;


    @GetMapping("hello")
    public String index() {
        return helloRemoteFeign.hello( );
    }


}
