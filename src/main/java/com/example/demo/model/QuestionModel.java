package com.example.demo.model;

import lombok.Data;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:47 2018/7/27
 * @Modify By:
 */
@Data
public class QuestionModel {
    private String title;
    private String content;
    private String userId;
    private String labelId;
    private Integer type;
}
