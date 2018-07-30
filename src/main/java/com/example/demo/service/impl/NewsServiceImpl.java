package com.example.demo.service.impl;

import com.example.demo.Repository.NewsRepository;
import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:41 2018/7/30
 * @Modify By:
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsRepository newsRepository;
    @Override
    public boolean addNews(String title, String content, String authorId, String classifyId) {
        News news = new News();
        news.setTitle(title);
        news.setContent(content);
        news.setAuthorId(authorId);
        news.setClassifyId(classifyId);
        News news1 = newsRepository.save(news);
        if (null == news1) {
            return false;
        }
        return true;
    }
}
