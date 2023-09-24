package org.lmh;

/**
 * 工厂方法模式
 * @Author LMH
 * @Date 2023/7/27 18:03:51
 **/
public class test {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        CoffeeFactory coffeeFactory = new AmericanCoffeeFactory();
        coffeeStore.setCoffeeFactory(coffeeFactory);
        Coffee coffee = coffeeStore.orderCoffee();
        System.out.println(coffee.getName());
    }
}
