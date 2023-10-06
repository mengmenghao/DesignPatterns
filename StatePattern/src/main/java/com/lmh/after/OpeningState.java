package com.lmh.after;

/**
 * @author lmh
 * @description: 电梯开启状态类
 * @projectName: DesignPatterns
 * @className: OpeningState
 * @createDate: 2023/10/6 15:50
 */
public class OpeningState extends LiftState{
    @Override
    public void open() {
        System.out.println("电梯开启");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        // 调用当前状态中的context中的close方法
        super.context.close();
    }

    @Override
    public void run() {
        // 什么都不做
    }

    @Override
    public void stop() {
        // 什么都不做
    }
}
