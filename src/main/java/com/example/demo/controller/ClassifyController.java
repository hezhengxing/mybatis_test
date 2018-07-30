package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.config.Constants;
import com.example.demo.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 10:22 2018/7/30
 * @Modify By:
 */
@RestController
@RequestMapping("/v1/ClassifyController")
public class ClassifyController extends BaseController{
    @Autowired
    private ClassifyService classifyService;
    @PostMapping(value = "/insertLabel")
    public BaseResult insertQuestion(String name) {
        boolean m = classifyService.addClassify(name);
        if (m) {
            return sendResult200();
        } else {
            return sendResult500("新增失败");
        }
    }
}
