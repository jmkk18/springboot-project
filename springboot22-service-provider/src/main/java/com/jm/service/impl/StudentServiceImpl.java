package com.jm.service.impl;

import com.jm.model.Student;
import com.jm.service.StudentService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * 使用dubbo中的注解暴露服务
 */
@Service
@DubboService(interfaceClass = StudentService.class,version = "1.0",timeout = 5000)
public class StudentServiceImpl implements StudentService {
    @Override
    public Student queryStudent(Integer id) {
        Student student=new Student();
        if(1001==id){
            student.setId(id);
            student.setName("1001-zhangsan");
            student.setAge(20);
        }else if (1002==id){
            student.setId(id);
            student.setName("1002-lisi");
            student.setAge(22);
        }
        return student;
    }
}
