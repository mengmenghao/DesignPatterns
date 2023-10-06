package com.lmh.after;

/**
 * @author lmh
 * @description: 电梯运行状态类
 * @projectName: DesignPatterns
 * @className: OpeningState
 * @createDate: 2023/10/6 15:50
 */
public class RunningState extends LiftState{
    // 运行的时候不能开电梯
    @Override
    public void open() {
        // do nothing
    }

    // 虽然可以关门，但是这个动作不归这个类执行
    @Override
    public void close() {
        // do nothing
    }

    @Override
    public void run() {
        System.out.println("电梯正在运行...");
    }

    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }
}
