package com.lmh.class_adapter;

/**
 * @author lmh
 * @description: 适配者类的接口
 * @projectName: DesignPatterns
 * @className: TFCard
 * @createDate: 2023/9/28 16:09
 */
public interface TFCard {
    // 从TF卡中读取数据
    String readTF();
    // 写数据
    void writeTF(String msg);
}
