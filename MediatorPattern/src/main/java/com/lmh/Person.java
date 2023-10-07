package com.lmh;

/**
 * @author lmh
 * @description: 抽象同事类
 * @projectName: DesignPatterns
 * @className: Person
 * @createDate: 2023/10/7 20:30
 */
public abstract class Person {
    // 租房者或者房主的姓名
    protected String name;
    // 中介
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
