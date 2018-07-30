package com.example.demo.Repository;

import com.example.demo.entity.News;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:35 2018/7/30
 * @Modify By:
 */
public interface NewsRepository extends MongoRepository<News,String> {
}
