package com.lmh;

/**
 * @author lmh
 * @description: 访问者模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/14 22:44
 */
public class Client {
    public static void main(String[] args) {
        // 创建home对象
        Home home = new Home();
        // 添加元素到home对象中
        home.add(new Dog());
        home.add(new Cat());

        // 创建主人对象
        Owner owner = new Owner();
        home.action(owner);
    }
}
