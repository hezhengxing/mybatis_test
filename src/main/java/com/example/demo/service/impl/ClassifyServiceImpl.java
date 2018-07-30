package com.example.demo.service.impl;

import com.example.demo.config.Constants;
import com.example.demo.entity.Classify;
import com.example.demo.mapper.ClassifyMapper;
import com.example.demo.service.ClassifyService;
import com.example.demo.utils.RedisTemplateUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 10:15 2018/7/30
 * @Modify By:
 */
@Service
public class ClassifyServiceImpl implements ClassifyService{
    @Autowired
    private ClassifyMapper classifyMapper;
    @Autowired
    private RedisTemplateUtil redisTemplateUtil;
    @Override
    public boolean addClassify(String name) {
        Classify classify = new Classify();
        classify.setName(name);
        int b = classifyMapper.insert(classify);
        if (Constants.INSERT_BOOLEAN_FIRST.equals(String.valueOf(b))) {
            redisTemplateUtil.cacheHash(Constants.INSERTUSRREDCLASSIFY,"",classify.getId(), JSONObject.valueToString(classify));
            return  true;
        }
        return false;
    }
}
