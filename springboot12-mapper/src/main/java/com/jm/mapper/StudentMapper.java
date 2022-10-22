package com.jm.mapper;

import com.jm.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper {
    Student selectById(Integer Id);
}
