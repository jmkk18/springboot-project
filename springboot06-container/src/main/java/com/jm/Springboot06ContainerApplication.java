package com.jm;

import com.jm.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot06ContainerApplication {

    public static void main(String[] args) {
        //获取容器对象
        //ConfigurableApplicationContext context = SpringApplication.run(Springboot06ContainerApplication.class, args);
        ApplicationContext context = SpringApplication.run(Springboot06ContainerApplication.class, args);

        //从容其中获取对象
        UserService userService= (UserService) context.getBean("userService");
        userService.sayHello("李四");
    }

}
