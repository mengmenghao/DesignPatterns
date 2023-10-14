package com.lmh;

/**
 * @author lmh
 * @description: 抽象元素角色类
 * @projectName: DesignPatterns
 * @className: Animal
 * @createDate: 2023/10/14 22:40
 */
public interface Animal {
    // 接受访问者访问的功能
    void accept(Person person);
}
