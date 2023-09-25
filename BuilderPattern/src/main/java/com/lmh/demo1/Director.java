package com.lmh.demo1;

/**
 * @author lmh
 * @description: 指挥者类
 * @projectName: DesignPatterns
 * @className: Director
 * @createDate: 2023/9/25 17:25
 */
public class Director {
    // 声明builder类型的变量
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 组装自行车的功能
    public Bike construct(){
        builder.buildSeat();
        builder.buildFrame();
        return builder.bike;
    }
}
