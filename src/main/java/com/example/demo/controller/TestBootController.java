package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:22 2018/7/24
 * @Modify By:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

    @RequestMapping("getuser")
    public User getUser() {
        User user = new User();
        user.setName("test");
        return user;
    }
}