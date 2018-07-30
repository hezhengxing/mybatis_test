package com.example.demo.controller;

import com.example.demo.config.Constants;
import com.example.demo.model.RabbitModel;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 11:42 2018/7/30
 * @Modify By:
 */
@Component
public class HelloSender {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send() {
        RabbitModel rabbitModel = new RabbitModel();
        rabbitModel.setName("lisi");
        rabbitModel.setPassword("123456");
        rabbitModel.setPhone("12358");
        rabbitTemplate.convertAndSend(Constants.RABBITTESTHEZHENGXING,rabbitModel);
        rabbitTemplate.convertAndSend("exchange","topic.message","hello!rabbit");
        rabbitTemplate.convertAndSend("fanoutExchange","","学到老,活到老");
    }
}
