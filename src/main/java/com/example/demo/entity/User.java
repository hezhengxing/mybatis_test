package com.example.demo.entity;

import com.example.demo.config.BaeEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:21 2018/7/24
 * @Modify By:
 */
@Entity
@Table(name = "t_user")
@Data
public class User extends BaeEntity{
    private String name;
    private String password;
    private String phone;
}
