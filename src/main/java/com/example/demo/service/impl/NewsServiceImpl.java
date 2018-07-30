package com.example.demo.service.impl;

import com.example.demo.Repository.NewsRepository;
import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;


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

    @Autowired
    private MongoTemplate mongoTemplate;

    private static final Logger log = LoggerFactory.getLogger(NewsService.class);

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

    @Override
    public List<News> findNewsAll() {
        Query query = new Query();
        query.addCriteria(Criteria.where("title").is("西虹市首富"));
        query.with(new Sort(Sort.Direction.DESC,"createTime"));
        List<News> list = mongoTemplate.find(query,News.class);
        log.info("查询到的数据为:"+list);
        if (list.size()>0) {
            return list;
        }
        return null;
    }
}
