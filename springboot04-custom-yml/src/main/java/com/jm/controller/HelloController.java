package com.jm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Value("${server.port}")
    private Integer port;

    @Value("${school.name}")
    private String name;

    @RequestMapping("/date")
    @ResponseBody
    public String queryDate(){
        return "使用的端口"+port+","+"name="+name;
    }
}
