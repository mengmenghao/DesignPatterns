package com.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/7 21:20
 */
public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStruct mediatorStruct = new MediatorStruct();
        // 创建租房者对象
        Tenant tenant = new Tenant("李四",mediatorStruct);
        // 创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStruct);

        // 中介者要知道具体的房主和租房者
        mediatorStruct.setHouseOwner(houseOwner);
        mediatorStruct.setTenant(tenant);


        tenant.constact("我要租三室的房子！！！");
        houseOwner.constact("我这里有三室的房子你要租吗");
    }
}
