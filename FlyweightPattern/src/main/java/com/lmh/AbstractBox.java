package com.lmh;

/**
 * @author lmh
 * @description: 抽象享元角色
 * @projectName: DesignPatterns
 * @className: AbstractBox
 * @createDate: 2023/10/3 17:41
 */
public abstract class AbstractBox {
    //获取图像的方法
    public abstract String getShape();

    // 显示图形及颜色
    public void display(String color) {
        System.out.println("方块形状:" + getShape() + ",颜色：" + color);
    }
}
