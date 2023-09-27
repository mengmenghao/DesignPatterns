package com.lmh.cglib_proxy;

/**
 * @author lmh
 * @description: 注意jdk9开始限制了jdk8中的反射相关功能，需要在VM中添加 --add-opens java.base/java.lang=ALL-UNNAMED参数
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/27 21:59
 */
public class Client {
    public static void main(String[] args) {
        // 创建代理工厂对象
        ProxyFactory proxyFactory = new ProxyFactory();

        // 获取代理对象
        TrainStation proxyObject = proxyFactory.getProxyObject();

        System.out.println("获取代理对象完成");
        // 调用代理对象方法
        proxyObject.sell();
    }
}
