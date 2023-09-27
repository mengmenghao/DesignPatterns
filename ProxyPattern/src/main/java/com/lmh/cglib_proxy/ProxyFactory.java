package com.lmh.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author lmh
 * @description: 获取代理对象的工厂类
 * @projectName: DesignPatterns
 * @className: ProxyFactory
 * @createDate: 2023/9/27 21:02
 */
public class ProxyFactory implements MethodInterceptor {

    private TrainStation trainStation = new TrainStation();

    public TrainStation getProxyObject() {
        // 创建Enhancer对象，类似于jdk代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("----");
        //Object invoke = method.invoke(trainStation, objects);
        Object invoke = methodProxy.invokeSuper(o, objects);
        return invoke;
    }
}
