package com.jm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public ModelAndView hello(){
        ModelAndView mv=new ModelAndView();
        mv.addObject("data","SpringBoot打包为jav");
        mv.setViewName("main");
        return mv;
    }
}
