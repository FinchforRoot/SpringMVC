package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by C1539 on 2018/1/27.
 */
@Controller
@RequestMapping("user") //代表请求发送到user.jsp之类的视图中
public class UserController {

    @RequestMapping("/test")
    public String testUser(){
        return "user";
    }

    @RequestMapping("/demo")
    public String demoUser(){
        return "user";
    }

}
