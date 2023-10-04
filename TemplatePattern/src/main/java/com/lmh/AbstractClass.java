package com.lmh;

import com.sun.jdi.VMOutOfMemoryException;

/**
 * @author lmh
 * @description: 抽象类（定义模板方法和基本方法）
 * @projectName: DesignPatterns
 * @className: AbstractClass
 * @createDate: 2023/10/4 16:33
 */
public abstract class AbstractClass {

    // 模板方法定义
    public void cookProcess() {
        //
        pourOil();
        heatOil();
        pourVegetable();
        pourSauce();
        fry();
    }


    public void pourOil() {
        System.out.println("倒油");
    }

    // 第二步：热油是一样的，所以直接实现
    public void heatOil() {
        System.out.println("热油");
    }

    // 第三步：倒蔬菜是不一样的（一个是包菜，一个是菜心）
    public abstract void pourVegetable();


    // 第四步： 倒调味料是不一样的
    public abstract void pourSauce();

    // 第5步：翻炒是一样的，所以直接实现
    public void fry() {
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
