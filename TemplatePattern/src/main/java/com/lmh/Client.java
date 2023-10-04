package com.lmh;

/**
 * @author lmh
 * @description: 模板模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/4 17:04
 */
public class Client {
    public static void main(String[] args) {
        // 炒包菜
        // 创建对象
        AbstractClass baoCai = new ConcreteClass_BaoCai();
        // 调用炒菜的功能
        baoCai.cookProcess();
    }
}
