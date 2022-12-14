package com.jm.service.impl;

import com.jm.mapper.StudentMapper;
import com.jm.pojo.Student;
import com.jm.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentMapper studentMapper;

    /**
     * @Transactional 表示方法有事务支持
     *      默认：使用数据库的隔离级别，REQUIRED 传播行为: 超时时间 -1
     *      抛出运行时异常，回滚事务
     */
    @Transactional
    @Override
    public int addStudent(Student student) {
        System.out.println("业务方法开始...");
        int count=studentMapper.insert(student);
        System.out.println("业务方法结束...");
        //抛出异常,目的是回滚事务
        //int m=10/0;
        return count;
    }
}
