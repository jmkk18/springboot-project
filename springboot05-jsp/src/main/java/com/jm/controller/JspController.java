package com.jm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class JspController {

    @RequestMapping("/myJsp")
    public String jsp(HttpServletRequest request){
        request.setAttribute("data","jsp");
        return "index";
    }

}
