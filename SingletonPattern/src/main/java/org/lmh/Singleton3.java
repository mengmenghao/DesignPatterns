package org.lmh;

/**
 * @author lmh
 * @description: 懒汉式
 * @projectName: DesignPatterns
 * @className: Singleton3
 * @createDate: 2023/9/23 16:15
 */
public class Singleton3 {
    // 私有化构造方法
    private Singleton3() {
    }

    // 声明Singleton类型的变量
    private static Singleton3 instance;


    // 对外提供获取该类对象的方法
    public static synchronized Singleton3 getInstance(){
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
