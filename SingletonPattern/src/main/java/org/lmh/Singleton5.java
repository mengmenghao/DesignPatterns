package org.lmh;

/**
 * @author lmh
 * @description:  懒汉式 静态内部类
 * @projectName: DesignPatterns
 * @className: Singleton5
 * @createDate: 2023/9/23 16:32
 */
public class Singleton5 {
    // 私有化构造方法
    private Singleton5() {
    }

    // 定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部类的对象
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    // 对外提供获取该类对象的方法
    public static Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
