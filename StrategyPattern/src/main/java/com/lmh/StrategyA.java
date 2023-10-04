package com.lmh;

/**
 * @author lmh
 * @description: 具体策略类，封装算法
 * @projectName: DesignPatterns
 * @className: StrategyA
 * @createDate: 2023/10/4 18:23
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一");
    }
}
