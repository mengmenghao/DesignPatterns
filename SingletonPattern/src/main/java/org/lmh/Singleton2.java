package org.lmh;

/**
 * @author lmh
 * @description: 饿汉式  静态代码块
 * @projectName: DesignPatterns
 * @className: Singleton2
 * @createDate: 2023/9/23 16:09
 */
public class Singleton2 {

    // 私有化构造方法
    private Singleton2() {
    }

    // 声明Singleton类型的变量
    private static Singleton2 instance;

    // 在静态代码块中进行赋值
    static {
        instance = new Singleton2();
    }

    // 对外提供获取该类对象的方法
    public static Singleton2 getInstance(){
        return instance;
    }
}
