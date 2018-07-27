package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.config.Constants;
import com.example.demo.service.LabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 15:40 2018/7/27
 * @Modify By:
 */
@RestController
@RequestMapping("/v1/LabelController")
public class LabelController extends BaseController{
    @Autowired
    LabelService labelService;

    /**
     * 新增标签
     * @param labelName
     * @param classifyId
     * @return
     */
    @PostMapping(value = "insertLabel")
    public BaseResult insertQuestion(String labelName,String classifyId) {
        int m = labelService.insertLabel(labelName,classifyId);
        if (Constants.INSERT_BOOLEAN_FIRST.equals(String.valueOf(m))) {
            return sendResult200();
        } else {
            return sendResult500("新增失败");
        }
    }
}
