package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.config.Constants;
import com.example.demo.entity.User;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:08 2018/7/26
 * @Modify By:
 */
@RestController
@RequestMapping("/v1/UserController")
public class UserController extends BaseController {
    @Autowired
    private UserService userService;

    /**
     * 新增用户
     * @param user
     * @return
     */
    @PostMapping(value = "/addUser")
    public BaseResult insertUser(UserModel user) {
        int b = userService.insertUser(user);
        if (String.valueOf(b).equals(Constants.INSERT_BOOLEAN_FIRST)) {
            return sendResult200();
        } else {
            return sendResult500("新增失败了哦");
        }
    }

    /**
     * 用户查询
     * @param userId
     * @return
     */
    @GetMapping(value = "/selectUser")
    public BaseResult<User> selectUser(@RequestParam(value = "userId", required = true) String userId) {
        User user = userService.selectUser(userId);
        return sendResult200(user);
    }
}
