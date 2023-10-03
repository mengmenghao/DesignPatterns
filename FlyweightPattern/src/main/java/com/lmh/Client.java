package com.lmh;

/**
 * @author lmh
 * @description: 享元模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/3 17:55
 */
public class Client {
    public static void main(String[] args) {
        //获取I图形对象
        AbstractBox i = BoxFactory.getInstance().getShape("I");
        i.display("灰色");

        AbstractBox L = BoxFactory.getInstance().getShape("L");
        L.display("绿色");

        AbstractBox O = BoxFactory.getInstance().getShape("O");
        O.display("灰色");


        AbstractBox O2 = BoxFactory.getInstance().getShape("O");
        O2.display("红色");

        System.out.println("两次获取到的O图像对象是否是同一对象：" + (O == O2));
    }
}
