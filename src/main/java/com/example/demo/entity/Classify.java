package com.example.demo.entity;

import com.example.demo.config.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 10:04 2018/7/30
 * @Modify By:
 */
@Data
@Entity
public class Classify extends BaseEntity{
    /**
     * 标签名
     */
    private String name;
}
