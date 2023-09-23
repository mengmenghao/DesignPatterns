package org.lmh;

import java.io.Serializable;

/**
 * @author lmh
 * @description:  懒汉式 静态内部类
 * @projectName: DesignPatterns
 * @className: Singleton5
 * @createDate: 2023/9/23 16:32
 */
public class Singleton5 implements Serializable {
    private static boolean flag = false;
    // 私有化构造方法
    private Singleton5() {

        // 解决反射破坏单例
        synchronized (Singleton5.class) {
            if (flag) {
                throw new RuntimeException("不能创建多个对象");
            }

            flag = true;
        }
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

    // 解决反序列化时的单例破坏，当进行反序列化时，会自动调用该方法，将该方法的返回值返回
    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
