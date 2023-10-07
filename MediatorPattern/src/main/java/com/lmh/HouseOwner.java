package com.lmh;

/**
 * @author lmh
 * @description: 具体的同事角色类
 * @projectName: DesignPatterns
 * @className: HouseOwner
 * @createDate: 2023/10/7 20:40
 */
public class HouseOwner extends Person{
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介者联系（沟通）
    public void constact(String message) {
        mediator.constact(message,this);
    }


    // 获取信息
    public void getMessage(String message) {
        System.out.println("房主" + name + "获取到的信息是" + message);
    }
}
