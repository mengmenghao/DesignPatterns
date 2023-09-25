package com.lmh.test;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Citation
 * @createDate: 2023/9/25 12:20
 */
public class Citation implements Cloneable {
    // 三好学生上的姓名
    private String name;

    private Citation age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Citation age) {
        this.age = age;
    }

    public void show() {
        System.out.println(name + "同学评为三好学生,年龄="+age);
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
