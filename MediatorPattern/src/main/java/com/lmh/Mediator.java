package com.lmh;

/**
 * @author lmh
 * @description: 抽象中介者类
 * @projectName: DesignPatterns
 * @className: Mediator
 * @createDate: 2023/10/7 20:28
 */
public abstract class Mediator {
    // 沟通的方法
    public abstract void constact(String message,Person person);
}
