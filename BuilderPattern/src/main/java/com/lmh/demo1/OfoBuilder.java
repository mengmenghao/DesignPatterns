package com.lmh.demo1;

/**
 * @author lmh
 * @description: ofo单车构建者
 * @projectName: DesignPatterns
 * @className: OfoBuilder
 * @createDate: 2023/9/25 17:24
 */
public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        bike.setFrame("铝合金车架");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("橡胶车架");
    }

    @Override
    public Bike createBike() {
        return bike;
    }
}
