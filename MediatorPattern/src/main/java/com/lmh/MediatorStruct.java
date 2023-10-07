package com.lmh;

/**
 * @author lmh
 * @description: 具体的中介者角色类
 * @projectName: DesignPatterns
 * @className: MediatorStruct
 * @createDate: 2023/10/7 21:17
 */
public class MediatorStruct extends Mediator{
    // 聚合房主和具体的租房者对象
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void constact(String message, Person person) {
        if (person == houseOwner) {
            tenant.getMessage(message);
        }

        if (person == tenant) {
            houseOwner.getMessage(message);
        }
    }
}
