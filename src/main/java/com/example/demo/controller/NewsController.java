package com.example.demo.controller;

import com.example.demo.config.BaseController;
import com.example.demo.config.BaseResult;
import com.example.demo.entity.News;
import com.example.demo.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:46 2018/7/30
 * @Modify By:
 */
@RestController
@RequestMapping("/v1/NewsController")
public class NewsController extends BaseController{
    @Autowired
    NewsService newsService;

    @PostMapping(value = "/addNews")
    public BaseResult addNews(@RequestParam String title,String content,String authorId,String classifyId) {
        boolean b = newsService.addNews(title, content, authorId, classifyId);
        if (b) {
            return  sendResult200();
        } else {
            return sendResult500("新增失败");
        }
    }

    @PostMapping(value = "/findNewsAll")
    public BaseResult<List<News>> findNewsAll(){
        List<News> list = newsService.findNewsAll();
        if (null != list) {
            return sendResult200(list);
        }
        return sendResult500();
    }
}
