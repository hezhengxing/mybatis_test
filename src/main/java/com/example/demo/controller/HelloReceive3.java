package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:32 2018/7/30
 * @Modify By:
 */
@Component
@RabbitListener(queues="fanout.C")
public class HelloReceive3 {
    @Autowired
    private UserMapper userMapper;

    @RabbitHandler
    public void processC(String str) {
//        User user = new User();
//        user.setName(str.getName());
//        user.setPassword(str.getPassword());
//        user.setPhone(str.getPhone());
//        userMapper.insert(user);
        System.out.println("Receive3:" + str);
    }
}
