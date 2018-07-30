package com.example.demo.service.impl;

import com.example.demo.config.Constants;
import com.example.demo.entity.Label;
import com.example.demo.mapper.LabelMapper;
import com.example.demo.service.LabelService;
import com.example.demo.utils.RedisTemplateUtil;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 15:37 2018/7/27
 * @Modify By:
 */
@Service
public class LabelServiceImpl implements LabelService {
    @Autowired
    LabelMapper labelMapper;
    @Autowired
    RedisTemplateUtil redisTemplateUtil;
    @Override
    public int insertLabel(String labelName ,String classifyId) {
        Label label = new Label();
        label.setLabelName(labelName);
        label.setClassifyId(classifyId);
        label.setUseNumber(0);
        int m = labelMapper.insert(label);
        redisTemplateUtil.cacheHash(Constants.INSERTUSRREDLABEL,"",label.getId(), JSONObject.valueToString(label));
        return m;
    }
}
