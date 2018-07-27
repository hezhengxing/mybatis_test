package com.example.demo.entity;

import com.example.demo.config.BaeEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 15:21 2018/7/27
 * @Modify By:
 */
@Entity
@Data
public class Label extends BaeEntity{
    private String labelName;
    private Integer useNumber;
    private String classifyId;
}
