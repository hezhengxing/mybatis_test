package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 13:58 2018/7/30
 * @Modify By:
 */
@Data
public class RabbitModel implements Serializable{
    private String name;
    private String password;
    private String phone;
}
