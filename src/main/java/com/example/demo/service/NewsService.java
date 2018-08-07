package com.example.demo.service;

import com.example.demo.entity.News;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.List;

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

    /**
     *
     * @return
     */
    List<News> findNewsAll();

    /**
     *
     * @param title
     * @param content
     * @param authorId
     * @param classifyId
     * @return
     */
    boolean updateNews(String newsId,String title, String content,String authorId,String classifyId);
}
