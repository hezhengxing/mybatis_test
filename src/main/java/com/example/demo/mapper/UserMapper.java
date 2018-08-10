package com.example.demo.mapper;

import com.example.demo.config.MyMapper;
import com.example.demo.entity.User;
import com.example.demo.model.UserModel;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 13:42 2018/7/26
 * @Modify By:
 */
public interface UserMapper extends MyMapper<User> {
    /**
     * 查询用户
     * @param userId
     * @return
     */
    User selectUser(String userId);

    /**
     *
     * @param name
     * @param password
     * @return
     */
    User selectUserLogin(UserModel userModel);
}
