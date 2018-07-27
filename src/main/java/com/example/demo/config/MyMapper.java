package com.example.demo.config;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author:HeZhengXing
 * @Descripton: 通用mapper
 * @Date: Created in 15:03 2018/7/24
 * @Modify By:
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T>{
}
