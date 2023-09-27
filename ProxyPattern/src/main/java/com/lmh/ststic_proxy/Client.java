package com.lmh.ststic_proxy;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/27 20:33
 */
public class Client {
    public static void main(String[] args) {
        // 创建代理对象
        ProxyPoint proxyPoint = new ProxyPoint();
        proxyPoint.sell();
    }
}
