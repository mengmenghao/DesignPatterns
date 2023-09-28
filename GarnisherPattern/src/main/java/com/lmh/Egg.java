package com.lmh;

/**
 * @author lmh
 * @description: 鸡蛋类（具体的装饰者角色）
 * @projectName: DesignPatterns
 * @className: Egg
 * @createDate: 2023/9/28 17:21
 */
public class Egg extends Garnish{

    public Egg(FastFood fastFood) {
        super(fastFood, 1, "鸡蛋");
    }

    @Override
    public float cost() {
        // 计算价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + getFastFood().getDesc();
    }
}
