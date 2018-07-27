package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.config.Constants;
import com.example.demo.model.QuestionModel;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 15:04 2018/7/27
 * @Modify By:
 */
@RestController
@RequestMapping("/v1/QuestionController")
public class QuestionController extends BaseController {
    @Autowired
    private QuestionService questionService;
    /**
     *
     * @param questionModel
     * @return
     */
    @PostMapping(value = "insertQuestion")
    public BaseResult insertQuestion(@RequestBody QuestionModel questionModel) {
        int m = questionService.insertQuestion(questionModel);
        if (Constants.INSERT_BOOLEAN_FIRST.equals(String.valueOf(m))) {
            return sendResult200();
        } else {
            return sendResult500("新增失败");
        }
    }
}
