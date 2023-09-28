package com.lmh.class_adapter;

/**
 * @author lmh
 * @description: 计算机类
 * @projectName: DesignPatterns
 * @className: Computer
 * @createDate: 2023/9/28 16:25
 */
public class Computer {
    // 从SD卡读取数据
    public String readSD(SDCard sdCard) {
        if (sdCard == null) {
            throw new NullPointerException("sd card is not null");
        }
        return sdCard.readSD();
    }
}
