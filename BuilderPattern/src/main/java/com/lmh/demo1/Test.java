package com.lmh.demo1;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Test
 * @createDate: 2023/9/25 17:29
 */
public class Test {
    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike construct = director.construct();
        System.out.println(construct);

    }
}
