package com.lmh.after;

/**
 * @author lmh
 * @description: 电梯关闭状态类
 * @projectName: DesignPatterns
 * @className: OpeningState
 * @createDate: 2023/10/6 15:50
 */
public class ClosingState extends LiftState{
    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    @Override
    public void close() {
        System.out.println("电梯门关闭");
    }

    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
