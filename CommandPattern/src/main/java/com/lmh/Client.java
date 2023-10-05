package com.lmh;

/**
 * @author lmh
 * @description: 命令模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/5 19:52
 */
public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.setDiningTable(1);
        order.setFoodDir("西红柿鸡蛋面",1);
        order.setFoodDir("小杯可乐",2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFoodDir("尖椒肉丝盖饭",1);
        order2.setFoodDir("小杯雪碧",1);

        // 创建接受者对象
        SeniorChef seniorChef = new SeniorChef();
        // 创建命令对象
        OrderCommand orderCommand = new OrderCommand(seniorChef,order);
        OrderCommand orderCommand2 = new OrderCommand(seniorChef,order2);

        // 创建调用者（服务员对象）
        Waitor waitor = new Waitor();
        waitor.setCommand(orderCommand);
        waitor.setCommand(orderCommand2);


        // 让服务员发起命令
        waitor.orderUp();
    }
}
