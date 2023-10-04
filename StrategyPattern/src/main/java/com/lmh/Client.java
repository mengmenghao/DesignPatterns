package com.lmh;

/**
 * @author lmh
 * @description: 策略模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/4 18:32
 */
public class Client {
    public static void main(String[] args) {
        SalesMan salesMan = new SalesMan(new StrategyA());
        salesMan.salesManShow();
    }
}
