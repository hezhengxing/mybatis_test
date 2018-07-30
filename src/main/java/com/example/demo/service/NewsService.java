package com.example.demo.service;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:39 2018/7/30
 * @Modify By:
 */
public interface NewsService {
    /**
     *
     * @param title
     * @param content
     * @param authorId
     * @param classifyId
     * @return
     */
    boolean addNews(String title,String content,String authorId,String classifyId);
}
