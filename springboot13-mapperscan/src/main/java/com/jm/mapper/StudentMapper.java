package com.jm.mapper;

import com.jm.pojo.Student;
import org.apache.ibatis.annotations.Mapper;


public interface StudentMapper {
    Student selectById(Integer Id);
}
