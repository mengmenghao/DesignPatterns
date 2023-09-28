package com.lmh;

/**
 * @author lmh
 * @description: 炒面（具体的构件角色）
 * @projectName: DesignPatterns
 * @className: FriedNoodles
 * @createDate: 2023/9/28 17:16
 */
public class FriedNoodles extends FastFood{
    public FriedNoodles() {
        super(12,"炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
