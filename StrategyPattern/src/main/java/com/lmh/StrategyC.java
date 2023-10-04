package com.lmh;

/**
 * @author lmh
 * @description: 具体策略类，封装算法
 * @projectName: DesignPatterns
 * @className: StrategyC
 * @createDate: 2023/10/4 18:26
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000加1元换购任意200元以下商品");
    }
}
