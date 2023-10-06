package com.lmh.before;

/**
 * @author lmh
 * @description: 电梯类（ILift的子实现类）
 * @projectName: DesignPatterns
 * @className: Lift
 * @createDate: 2023/10/6 15:02
 */
public class Lift implements ILift{
    // 声明一个记录当前电梯的状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE -> {}
            case CLOSING_STATE -> {
                System.out.println("电梯打开了...");
                // 设置当前电梯状态为开启状态
                setState(OPENING_STATE);
            }
            case STOPPING_STATE -> {
                System.out.println("电梯打开了...");
                // 设置当前电梯状态为开启状态
                setState(OPENING_STATE);
            }
            case RUNNING_STATE -> {

            }
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE -> {
                System.out.println("电梯关门了...");
                setState(CLOSING_STATE);
            }
            case CLOSING_STATE -> {
            }
            case STOPPING_STATE -> {

            }
            case RUNNING_STATE -> {

            }
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE -> {}
            case CLOSING_STATE -> {
                System.out.println("电梯开始运行了...");
                // 设置当前电梯状态为开启状态
                setState(RUNNING_STATE);
            }
            case STOPPING_STATE -> {
                System.out.println("电梯开始运行了...");
                // 设置当前电梯状态为开启状态
                setState(RUNNING_STATE);
            }
            case RUNNING_STATE -> {

            }
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE -> {

            }
            case CLOSING_STATE -> {
                System.out.println("电梯停止了...");
                // 设置当前电梯状态为开启状态
                setState(STOPPING_STATE);
            }
            case STOPPING_STATE -> {

            }
            case RUNNING_STATE -> {
                System.out.println("电梯停止了...");
                // 设置当前电梯状态为开启状态
                setState(STOPPING_STATE);
            }
        }
    }
}
