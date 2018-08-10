package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.model.UserModel;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 13:38 2018/7/26
 * @Modify By:
 */
public interface UserService {

    /**
     * 新增一个user
     * @param user
     * @return
     */
    int insertUser(UserModel user);

    /**
     * 查询用户
     * @param userId
     * @return
     */
    User selectUser(String userId);

    /**
     *
     * @param userModel
     * @return
     */
    User selectUserLogin(String name,String password);

}
