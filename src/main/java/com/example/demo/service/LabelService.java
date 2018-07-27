package com.example.demo.service;

import com.example.demo.entity.Label;

/**
 * @Author:HeZhengXing
 * @Descripton:
 * @Date: Created in 15:31 2018/7/27
 * @Modify By:
 */
public interface LabelService {
    /**
     *
     * @param labelName
     * @return
     */
    public int insertLabel(String labelName ,String calssifyId);
}
