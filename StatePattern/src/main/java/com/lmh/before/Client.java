package com.lmh.before;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/6 15:24
 */
public class Client {
    public static void main(String[] args) {
        // 创建电梯对象
        Lift lift = new Lift();
        // 设置当前电梯的状态
        lift.setState(ILift.OPENING_STATE);
        // 打开
        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}
