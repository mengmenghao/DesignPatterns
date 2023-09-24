package org.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: LatteCoffeeFactory
 * @createDate: 2023/9/24 17:09
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
