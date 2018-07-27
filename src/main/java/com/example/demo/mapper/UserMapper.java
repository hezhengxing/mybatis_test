package com.example.demo.mapper;

import com.example.demo.config.MyMapper;
import com.example.demo.entity.User;

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
}
