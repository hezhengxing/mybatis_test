package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:HeZhengXing
 * @Descripton: 监听器监听指定的Queue
 * @Date: Created in 14:32 2018/7/30
 * @Modify By:
 */
@Component
@RabbitListener(queues="fanout.B")
public class HelloReceive2 {
    @Autowired
    private UserMapper userMapper;

    @RabbitHandler
    public void processC(String str) {
//        User user = new User();
//        user.setName(str.getName());
//        user.setPassword(str.getPassword());
//        user.setPhone(str.getPhone());
//        userMapper.insert(user);
        System.out.println("Receive2:" + str);
    }
}
