package com.lmh.demo1;

/**
 * @author lmh
 * @description: 抽象构建者
 * @projectName: DesignPatterns
 * @className: Builder
 * @createDate: 2023/9/25 17:18
 */
public abstract class Builder {
    // 声明Bike类型的变量并进行赋值
    protected Bike bike = new Bike();

    public abstract void  buildFrame();

    public abstract  void buildSeat();

    // 构建自行车的方法
    public abstract Bike createBike();
}
