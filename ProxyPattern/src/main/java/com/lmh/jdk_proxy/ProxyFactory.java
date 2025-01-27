package com.lmh.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author lmh
 * @description: 获取代理对象的工厂类
 * 代理类也实现了对应的接口
 * @projectName: DesignPatterns
 * @className: ProxyFactory
 * @createDate: 2023/9/27 21:02
 */
public class ProxyFactory {
    // 声明目标对象
    private TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {
        // 返回代理对象
        /*
         * ClassLoader loader, 类加载器，用于加载代理类，可以通过目标对象获取类加载器
         * Class<?>[] interfaces, 代理类实现的接口的字节码对象
         * InvocationHandler h   代理对象的调用处理方式
         */
        SellTickets proxyInstance = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy  jdk创建的代理对象，和proxyInstance对象是同一个对象，在invoke方法中基本不用
                     *
                     * @param method 对接口中的方法进行封装的method对象
                     *
                     * @param args 调用方法的实际参数
                     *
                     * @return 方法的返回值
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了,在调用方法时才执行");
                        // 执行目标对象的方法
                        return method.invoke(trainStation,args);
                    }
                }
        );
        return proxyInstance;
    }
}
