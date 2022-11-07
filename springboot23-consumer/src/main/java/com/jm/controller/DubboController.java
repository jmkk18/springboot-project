package com.jm.controller;

import com.jm.model.Student;
import com.jm.service.StudentService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DubboController {

    /**
     * 引用远程服务，吧创建好的代理对象，注入给studentService
     */
    @DubboReference(interfaceClass = StudentService.class,version = "1.0")
    private StudentService studentService;

    @RequestMapping("/query")
    public String queryStudent(){
        Student student=studentService.queryStudent(1001);
        return "调用远程接口，获取对象："+student;
    }
}
