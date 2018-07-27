package com.example.demo.entity;

import com.example.demo.config.BaeEntity;
import lombok.Data;

import javax.persistence.Entity;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 14:41 2018/7/27
 * @Modify By:
 */
@Data
@Entity
public class Question extends BaeEntity{
    /**
     * 问题标题
     */
    private String title;

    /**
     * 问题内容
     */
    private String content;

    private String userId;

    private String labelId;

    private Integer recommend;

    private Integer type;

    /**
     * 是否推荐
     */
    public enum recommend {

        recommendIS (0,"推荐"),
        recommendNO (1,"不推荐");

        private Integer value;
        private String remark;
        recommend(Integer value, String remark) {
            this.value = value;
            this.remark = remark;
        }
        public Integer getValue() {
            return value;
        }
        public String getRemark() {
            return remark;
        }
    }

    /**
     * 类型区分
     */
    public enum type {

        TYPE1 (0,"文字"),
        TYPE2 (1,"图片"),
        TYPE3( 2,"图文混排");

        private Integer value;
        private String remark;
        type(Integer value, String remark) {
            this.value = value;
            this.remark = remark;
        }
        public Integer getValue() {
            return value;
        }
        public String getRemark() {
            return remark;
        }
    }
}
