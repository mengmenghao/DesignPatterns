package com.lmh;

/**
 * @author lmh
 * @description: 具体访问者角色类(主人)
 * @projectName: DesignPatterns
 * @className: Owner
 * @createDate: 2023/10/14 22:42
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
