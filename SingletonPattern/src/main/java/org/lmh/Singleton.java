package org.lmh;

/**
 * @author lmh
 * @description: 饿汉式  静态成员变量
 * @projectName: DesignPatterns
 * @className: Singleton
 * @createDate: 2023/9/23 16:03
 */
public class Singleton {
    //1、私有化构造方法
    private Singleton() {
    }

    // 2、在本类中创建本类的对象
    private static Singleton instance = new Singleton();

    // 3、提供一个公共的访问方式，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}
