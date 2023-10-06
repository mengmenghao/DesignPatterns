package com.lmh.after;


/**
 * @author lmh
 * @description: 抽象状态类
 * @projectName: DesignPatterns
 * @className: LiftState
 * @createDate: 2023/10/6 15:47
 */
public abstract class LiftState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    // 电梯开启操作
    public abstract void open();
    // 电梯关闭操作
    public abstract void close();
    // 电梯运行操作
    public abstract void run();
    // 电梯停止操作
    public abstract void stop();
}
