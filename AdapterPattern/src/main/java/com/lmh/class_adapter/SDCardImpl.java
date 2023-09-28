package com.lmh.class_adapter;

/**
 * @author lmh
 * @description: 具体的SD卡
 * @projectName: DesignPatterns
 * @className: SDCardImpl
 * @createDate: 2023/9/28 16:19
 */
public class SDCardImpl implements SDCard{
    @Override
    public String readSD() {
        String msg = "SDCard read msg: hello word SD";
        return msg;
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("SDCard write msg:" + msg);
    }
}
