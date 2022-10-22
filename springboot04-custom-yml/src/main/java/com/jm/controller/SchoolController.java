package com.jm.controller;

import com.jm.vo.SchoolInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SchoolController {
    @Resource
    private SchoolInfo schoolInfo;

    @RequestMapping("/myschool")
    @ResponseBody
    public String doSchool(){
        return "学校信息: "+schoolInfo;
    }
}
