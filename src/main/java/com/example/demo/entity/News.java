package com.example.demo.entity;

import com.example.demo.config.BaseEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:29 2018/7/30
 * @Modify By:
 */
@Data
@Document
public class News extends BaseEntity {
    private String title;
    private String content;
    private String authorId;
    private String classifyId;
}
