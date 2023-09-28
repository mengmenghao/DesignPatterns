package com.lmh.object_adapter;

/**
 * @author lmh
 * @description: 目标接口
 * @projectName: DesignPatterns
 * @className: SDCard
 * @createDate: 2023/9/28 16:14
 */
public interface SDCard {
    String readSD();

    void writeSD(String msg);
}
