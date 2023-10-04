package com.lmh;

/**
 * @author lmh
 * @description: 炒包菜类（具体类）
 * @projectName: DesignPatterns
 * @className: ConcreteClass_BaoCai
 * @createDate: 2023/10/4 17:01
 */
public class ConcreteClass_BaoCai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
