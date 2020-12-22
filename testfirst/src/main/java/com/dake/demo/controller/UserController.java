package com.dake.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/test1")
    public String testWorld(){
        return "hello world 1 !!!";
        

    }


}
