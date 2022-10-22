package com.jm.service.impl;

import com.jm.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void sayHello(String name) {
        System.out.println("执行了业务逻辑方法的sayHello:" + name);
    }
}
