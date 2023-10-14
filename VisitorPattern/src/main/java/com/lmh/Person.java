package com.lmh;

/**
 * @author lmh
 * @description: 抽象访问者角色
 * @projectName: DesignPatterns
 * @className: Person
 * @createDate: 2023/10/14 22:38
 */
public interface Person {
    // 喂食宠物猫
    void feed(Cat cat);
    // 喂食宠物狗
    void feed(Dog dog);
}
