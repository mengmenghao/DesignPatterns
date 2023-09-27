package com.lmh.ststic_proxy;

/**
 * @author lmh
 * @description: 代售点类
 * @projectName: DesignPatterns
 * @className: ProxyPoint
 * @createDate: 2023/9/26 12:31
 */
public class ProxyPoint implements SellTickets{
    private TrainStation trainStation = new TrainStation();
    @Override
    public void sell() {
        System.out.println("代售点收取一些费用");
        trainStation.sell();
    }
}
