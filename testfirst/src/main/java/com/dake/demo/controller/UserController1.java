package com.dake.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController1 {

    @RequestMapping("/test2")
    public String testWorld(){
        return "hello world 2 !!!";
    }


}
