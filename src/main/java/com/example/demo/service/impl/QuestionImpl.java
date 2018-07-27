package com.example.demo.service.impl;

import com.example.demo.entity.Question;
import com.example.demo.mapper.QuestionMapper;
import com.example.demo.model.QuestionModel;
import com.example.demo.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:56 2018/7/27
 * @Modify By:
 */
@Service
public class QuestionImpl implements QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    /**
     * 提问
     * @param questionModel
     * @return
     */
    @Override
    public int insertQuestion(@RequestBody QuestionModel questionModel) {
        Question question = new Question();
        question.setContent(questionModel.getContent());
        question.setLabelId(questionModel.getLabelId());
        question.setTitle(questionModel.getTitle());
        question.setRecommend(1);
        question.setType(questionModel.getType());
        int f = questionMapper.insert(question);
        return f;
    }
}
