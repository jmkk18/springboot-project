package com.jm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @MapperScan 找到DMapper接口和Mapper文件
 *  basePackages：Dao接口所在的包名
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.jm.mapper","com.jm.dao"})
public class Springboot13MapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot13MapperApplication.class, args);
    }

}
