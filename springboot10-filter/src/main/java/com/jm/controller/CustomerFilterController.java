package com.jm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomerFilterController {
    @RequestMapping("/user/login")
    @ResponseBody
    public String login(){
        return "user/login";
    }

    @RequestMapping("/query")
    @ResponseBody
    public String query(){
        return "query";
    }
}
