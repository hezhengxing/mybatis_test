package com.example.demo.service;

import com.example.demo.model.QuestionModel;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:46 2018/7/27
 * @Modify By:
 */
public interface QuestionService {
    /**
     * 新增问题
     * @param questionModel
     * @return
     */
    int insertQuestion(QuestionModel questionModel);
}
