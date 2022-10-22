package com.jm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement //启用事务管理器
@MapperScan(value = "com.jm.mapper")
public class Springboot14TransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot14TransactionalApplication.class, args);
    }

}
