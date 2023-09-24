package com.lmh;

/**
 * @author lmh
 * @description: 简单咖啡工厂类，用来生产咖啡
 * @projectName: DesignPatterns
 * @className: com.lmh.SimpleCoffeeFactory
 * @createDate: 2023/9/24 16:35
 */
public class SimpleCoffeeFactory {

    public Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您点的咖啡没有");
        }

        return coffee;
    }

    // 静态工厂
    //public static com.lmh.Coffee createCoffee(String type){
    //    com.lmh.Coffee coffee = null;
    //    if ("american".equals(type)) {
    //        coffee = new com.lmh.AmericanCoffee();
    //    } else if ("latte".equals(type)){
    //        coffee = new com.lmh.LatteCoffee();
    //    } else {
    //        throw new RuntimeException("对不起，您点的咖啡没有");
    //    }
    //
    //    return coffee;
    //}
}
