package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login/v1")
public class LoginController extends BaseController{
    @Autowired
    UserService userService;

    @PostMapping(value = "/login")
    public BaseResult<User> login(String name,String password) {
        User user = userService.selectUserLogin(name, password);
        return sendResult200(user);
    }
}
