package com.lmh;

/**
 * @author lmh
 * @description: 外观模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/30 22:31
 */
public class Client {
    public static void main(String[] args) {
        SmartAppliancesFacade smartAppliancesFacade = new SmartAppliancesFacade();
        smartAppliancesFacade.say("打开家电");
        System.out.println("-----------");
        smartAppliancesFacade.say("关闭家电");
    }
}
