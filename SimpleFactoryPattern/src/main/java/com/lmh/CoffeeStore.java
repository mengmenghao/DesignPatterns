package com.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: com.lmh.CoffeeStore
 * @createDate: 2023/9/24 16:36
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        //SimpleCoffeeFactory simpleCoffeeFactory = new SimpleCoffeeFactory();
        //Coffee coffee = simpleCoffeeFactory.createCoffee(type);

        Coffee coffee = 工厂加配置文件.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
