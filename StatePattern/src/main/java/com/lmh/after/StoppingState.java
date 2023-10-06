package com.lmh.after;

/**
 * @author lmh
 * @description: 电梯停止状态类
 * @projectName: DesignPatterns
 * @className: OpeningState
 * @createDate: 2023/10/6 15:50
 */
public class StoppingState extends LiftState{
    // 停止状态，开门，那是要的
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了");
    }
}
