package com.lmh;

/**
 * @author lmh
 * @description: 具体策略类，封装算法
 * @projectName: DesignPatterns
 * @className: StrategyB
 * @createDate: 2023/10/4 18:24
 */
public class StrategyB implements Strategy{
    @Override
    public void show() {
        System.out.println("满200减50");
    }
}
