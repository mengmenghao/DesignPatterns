package com.lmh;

/**
 * @author lmh
 * @description: 促销员（环境类）
 * @projectName: DesignPatterns
 * @className: SalesMan
 * @createDate: 2023/10/4 18:29
 */
public class SalesMan {
    // 聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // 由促销员展示促销活动给用户
    public void salesManShow(){
        strategy.show();
    }
}
