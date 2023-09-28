package com.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/28 17:26
 */
public class Client {
    public static void main(String[] args) {
        FastFood friedRice = new FriedRice();
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost() + "元");

        System.out.println("---------------");
        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost() + "元");

        System.out.println("----------");

        friedRice = new Egg(friedRice);
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost() + "元");

        System.out.println("----------");

        friedRice = new Bacon(friedRice);
        System.out.println(friedRice.getDesc() + "  " + friedRice.cost() + "元");
    }
}
