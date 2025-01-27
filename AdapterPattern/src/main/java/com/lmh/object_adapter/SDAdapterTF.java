package com.lmh.object_adapter;


/**
 * @author lmh
 * @description: 适配器类
 * @projectName: DesignPatterns
 * @className: SDAdapterTF
 * @createDate: 2023/9/28 16:34
 */
public class SDAdapterTF implements SDCard {
    // 声明适配者类
    private TFCard tfCard;

    public SDAdapterTF(TFCard tfCard){
        this.tfCard = tfCard;
    }

    @Override
    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF();
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
