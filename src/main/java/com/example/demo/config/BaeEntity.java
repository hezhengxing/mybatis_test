package com.example.demo.config;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 9:19 2018/7/27
 * @Modify By:
 */
@Data
@MappedSuperclass
public class BaeEntity {
    @Id
    private String id = IdGen.uuid();

    private Date createTime=new Date();

    protected Date updateTime=new Date();
}
