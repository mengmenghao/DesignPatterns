package org.lmh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author lmh
 * @description: 反射破坏单例模式 解决方案：如Singleton5上的无参构造方法
 * @projectName: DesignPatterns
 * @className: 反射破坏单例模式
 * @createDate: 2023/9/23 16:53
 */
public class 反射破坏单例模式 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 1、获取Singleton的字节码对象
        Class clazz = Singleton5.class;
        // 2、获取无参构造方法对象
        Constructor cons = clazz.getDeclaredConstructor();
        // 3、取消访问检查
        cons.setAccessible(true);
        // 4、创建对象
        Singleton5 o = (Singleton5) cons.newInstance();
        Singleton5 o1 = (Singleton5) cons.newInstance();
        System.out.println(o==o1);
    }
}
