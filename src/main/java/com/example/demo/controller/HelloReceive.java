package com.example.demo.controller;

import com.example.demo.config.Constants;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.RabbitModel;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 11:43 2018/7/30
 * @Modify By:
 */
@Component
@RabbitListener(queues = Constants.RABBITTESTHEZHENGXING)    //监听器监听指定的Queue
public class HelloReceive {
    @Autowired
    private UserMapper userMapper;

    @RabbitHandler
    public void processC(RabbitModel str) {
        User user = new User();
        user.setName(str.getName());
        user.setPassword(str.getPassword());
        user.setPhone(str.getPhone());
        userMapper.insert(user);
        System.out.println("Receive:" + str);
    }
}
