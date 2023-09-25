package com.lmh.demo;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Realizetype
 * @createDate: 2023/9/25 11:56
 */
public class RealizeType  implements Cloneable{


    public RealizeType() {
        System.out.println("具体对象原型对象创建完成");
    }

    @Override
    public RealizeType clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealizeType) super.clone();
    }
}
