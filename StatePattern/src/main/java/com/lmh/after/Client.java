package com.lmh.after;

/**
 * @author lmh
 * @description: 状态模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/6 16:08
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(new ClosingState());
        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
