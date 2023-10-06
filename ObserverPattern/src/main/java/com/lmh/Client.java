package com.lmh;

/**
 * @author lmh
 * @description: 观察者模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/6 16:35
 */
public class Client {
    public static void main(String[] args) {
        // 1、创建公众号对象
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();

        // 2、订阅公众号
        subscriptionSubject.attach(new WeiXinUser("孙悟空"));
        subscriptionSubject.attach(new WeiXinUser("猪八戒"));
        subscriptionSubject.attach(new WeiXinUser("沙悟净"));

        // 3、公众号更新，发出消息
        subscriptionSubject.notify("测试消息");

        subscriptionSubject.detach(new WeiXinUser("沙悟净"));
        subscriptionSubject.notify("测试消息2");
    }
}
