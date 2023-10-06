package com.lmh.before;

/**
 * @author lmh
 * @description: 电梯接口
 * @projectName: DesignPatterns
 * @className: ILift
 * @createDate: 2023/10/6 14:58
 */
public interface ILift {
    // 定义4个电梯状态的常量
    int OPENING_STATE = 1;
    int CLOSING_STATE = 2;
    int RUNNING_STATE = 3;
    int STOPPING_STATE = 4;

    // 设置电梯状态的功能
    void setState(int state);

    // 电梯操作功能
    void open();
    void close();
    void run();
    void stop();
}
