package com.lmh;

/**
 * @author lmh
 * @description: 装饰者类（抽象装饰者角色）
 * @projectName: DesignPatterns
 * @className: Garnish
 * @createDate: 2023/9/28 17:18
 */
public abstract class Garnish extends FastFood{
    // 声明快餐类变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Garnish(FastFood fastFood,float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
