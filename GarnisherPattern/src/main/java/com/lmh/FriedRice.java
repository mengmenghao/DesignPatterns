package com.lmh;

/**
 * @author lmh
 * @description: 炒饭（具体构件角色）
 * @projectName: DesignPatterns
 * @className: FriedRice
 * @createDate: 2023/9/28 17:14
 */
public class FriedRice extends FastFood{

    public FriedRice() {
        super(10,"炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
