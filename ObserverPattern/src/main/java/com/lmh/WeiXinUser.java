package com.lmh;

/**
 * @author lmh
 * @description: 具体的观察者角色类
 * @projectName: DesignPatterns
 * @className: WeiXinUser
 * @createDate: 2023/10/6 16:33
 */
public class WeiXinUser implements Observer {
    private String name;

    public WeiXinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + "-" + message);
    }
}
