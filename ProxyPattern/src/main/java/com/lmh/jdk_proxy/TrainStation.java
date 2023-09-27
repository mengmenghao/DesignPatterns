package com.lmh.jdk_proxy;

/**
 * @author lmh
 * @description: 火车站类
 * @projectName: DesignPatterns
 * @className: TrainStation
 * @createDate: 2023/9/26 12:30
 */
public class TrainStation implements SellTickets {
    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
