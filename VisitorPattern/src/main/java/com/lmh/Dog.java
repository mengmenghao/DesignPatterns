package com.lmh;

/**
 * @author lmh
 * @description: 具体元素角色类（宠物狗）
 * @projectName: DesignPatterns
 * @className: Cat
 * @createDate: 2023/10/14 22:40
 */
public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this); // 访问者给宠物狗喂食
        System.out.println("好好吃，汪汪汪。。。。");
    }
}
