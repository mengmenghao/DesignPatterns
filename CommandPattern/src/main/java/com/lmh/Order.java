package com.lmh;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lmh
 * @description: 订单类
 * @projectName: DesignPatterns
 * @className: Order
 * @createDate: 2023/10/5 17:58
 */
public class Order {
    // 餐桌号码
    private int diningTable;
    // 所下的餐品及份数
    private Map<String,Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFoodDir(String name,int num) {
        foodDir.put(name,num);
    }
}
