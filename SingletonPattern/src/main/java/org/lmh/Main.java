package org.lmh;

/**
 * 单例模式
 */
public class Main {
    public static void main(String[] args) {
        //// 创建Singleton类对象
        //Singleton5 instance = Singleton5.getInstance();
        //Singleton5 instance1 = Singleton5.getInstance();
        //
        //// 判断两个是否是同一个对象
        //System.out.println(instance1 == instance);

        Singleton6 instance = Singleton6.INSTANCE;
        Singleton6 instance1 = Singleton6.INSTANCE;
        System.out.println(instance1 == instance);
    }
}