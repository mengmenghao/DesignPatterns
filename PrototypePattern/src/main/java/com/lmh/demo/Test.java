package com.lmh.demo;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Test
 * @createDate: 2023/9/25 11:58
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealizeType realizeType = new RealizeType();
        RealizeType clone = realizeType.clone();
        System.out.println(realizeType);
        System.out.println(clone);
        System.out.println(realizeType == clone);
    }
}
