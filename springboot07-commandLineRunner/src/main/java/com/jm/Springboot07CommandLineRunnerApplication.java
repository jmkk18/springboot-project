package com.jm;

import com.jm.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Springboot07CommandLineRunnerApplication implements CommandLineRunner {
    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        System.out.println("准备创建容器对象");
        //创建容器对象
        SpringApplication.run(Springboot07CommandLineRunnerApplication.class, args);
        System.out.println("容器对象创建之后");
    }

    @Override
    public void run(String... args) throws Exception {
        String str=helloService.sayHello("王五");
        System.out.println("调用容器中的对象=="+str);
        //可做自定义的工作，比如读取文件，数据库等等
        System.out.println("在容器对象创建好，执行的方法");
    }
}
