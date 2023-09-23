package org.lmh;

/**
 * @author lmh
 * @description: 懒汉式  双重检查锁方式
 * @projectName: DesignPatterns
 * @className: Singleton4
 * @createDate: 2023/9/23 16:26
 */
public class Singleton4 {
    // 私有化构造方法
    private Singleton4() {
    }

    // 声明Singleton类型的变量
    private static volatile Singleton4 instance;


    // 对外提供获取该类对象的方法
    public static Singleton4 getInstance(){
        // 第一次判断，如果instance的值不为null，不需要抢占锁
        if (instance == null) {
            synchronized (Singleton4.class) {
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
