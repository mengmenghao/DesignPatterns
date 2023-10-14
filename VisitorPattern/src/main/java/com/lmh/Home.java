package com.lmh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmh
 * @description: 对象结构类
 * @projectName: DesignPatterns
 * @className: Home
 * @createDate: 2023/10/14 22:44
 */
public class Home {
    // 声明一个集合对象，用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    // 接受访问
    public void action(Person person) {
        // 遍历集合，获取每个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
