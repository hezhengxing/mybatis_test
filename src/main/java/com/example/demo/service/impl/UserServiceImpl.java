package com.example.demo.service.impl;

import com.example.demo.config.BusinessException;
import com.example.demo.config.Constants;
import com.example.demo.config.IdGen;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.UserModel;
import com.example.demo.service.UserService;
import com.example.demo.utils.RedisTemplateUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 13:41 2018/7/26
 * @Modify By:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    RedisTemplateUtil redisTemplateUtil;

    /**
     * 新增user
     *
     * @param user
     * @return
     */
    @Override
    public int insertUser(UserModel user) {
        User user1 = new User();
        user1.setId(IdGen.uuid());
        user1.setName(user.getName());
        user1.setPhone(user.getPhone());
        user1.setPassword(user.getPassword());
        int f = userMapper.insert(user1);
        redisTemplateUtil.cacheHash(Constants.INSERTUSRREDISCODE1, "", user1.getId(), JSONObject.valueToString(user1));
        return f;
    }

    /**
     * 查询一个用户
     *
     * @param userId
     * @return
     */
    @Override
    public User selectUser(String userId) {
        User user = userMapper.selectUser(userId);
        if (null != user) {
            return user;
        } else {
            throw new BusinessException("查询用户失败");
        }
    }

    @Override
    public User selectUserLogin(String name,String password) {
        UserModel userModel = new UserModel();
        userModel.setName(name);
        userModel.setPassword(password);
        User user = userMapper.selectUserLogin(userModel);
        return user;
    }


}
