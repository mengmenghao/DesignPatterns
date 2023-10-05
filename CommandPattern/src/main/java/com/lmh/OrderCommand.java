package com.lmh;

import java.util.Map;

/**
 * @author lmh
 * @description: 具体的命令类
 * @projectName: DesignPatterns
 * @className: OrderCommand
 * @createDate: 2023/10/5 19:21
 */
public class OrderCommand implements Command{

    // 持有接收者对象
    private SeniorChef seniorChef;

    private Order order;

    public OrderCommand(SeniorChef seniorChef, Order order) {
        this.seniorChef = seniorChef;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String foodName : foodDir.keySet()) {
            seniorChef.makeFood(foodName, foodDir.get(foodName));
        }

    }
}
