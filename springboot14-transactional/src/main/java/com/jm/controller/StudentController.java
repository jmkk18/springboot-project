package com.jm.controller;

import com.jm.pojo.Student;
import com.jm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping("/addStudent")
    @ResponseBody
    public String addStudent(String name,Integer age){
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        int count=studentService.addStudent(student);
        return "添加学生"+count;
    }
}
