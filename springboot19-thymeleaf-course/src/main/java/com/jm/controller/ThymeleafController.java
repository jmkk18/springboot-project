package com.jm.controller;

import com.jm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tpl")
public class ThymeleafController {
    //标准变量表达式
    @GetMapping("/standard")
    public String standard(Model model){
        //添加数据到Model
        model.addAttribute("site","www.jmpower.com");
        model.addAttribute("myuser",new User(1001,"张三","男",19));
        //指定视图
        return "standard";
    }

    //选择标准变量表达式
    @GetMapping("/option")
    public String option(Model model){
        //添加数据到Model
        model.addAttribute("site","www.jmpower.com");
        model.addAttribute("myuser",new User(1001,"张三","男",19));
        //指定视图
        return "option";
    }

    //链接表达式
    @GetMapping("/link")
    public String link(Model model){
        model.addAttribute("userId",1002);
        return "link";
    }

    //测试链接表达式地址
    @GetMapping("/queryAccount")
    @ResponseBody
    public String queryAccount(Integer id){
        return "queryAccount,参数id="+id;
    }

    //有两个参数的
    @GetMapping("/queryUser")
    @ResponseBody
    public String queryUser(String name,Integer age){
        return "queryUser,有两个参数:name="+name+"#age="+age;
    }
}
