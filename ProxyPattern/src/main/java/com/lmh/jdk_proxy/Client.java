package com.lmh.jdk_proxy;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/27 21:10
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();
        System.out.println("-----");
        // 使用工厂对象发方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        System.out.println("------");
        // 调用方法
        proxyObject.sell();

        System.out.println(proxyObject.getClass());

        while (true) {

        }
    }
}
