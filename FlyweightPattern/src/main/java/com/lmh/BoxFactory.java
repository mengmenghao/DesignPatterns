package com.lmh;

import javax.swing.*;
import java.util.HashMap;

/**
 * @author lmh
 * @description: 工厂类，将该类设计为单例
 * @projectName: DesignPatterns
 * @className: BoxFactory
 * @createDate: 2023/10/3 17:49
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;

    public BoxFactory() {
        map = new HashMap<String, AbstractBox>();
        map.put("I",new IBox());
        map.put("L",new LBox());
        map.put("O",new OBox());
    }

    // 提供一个方法获取该工厂类对象
    public static BoxFactory getInstance() {
        return factory;
    }

    private static  BoxFactory factory = new BoxFactory();


    // 根据名称获取图像对象
    public AbstractBox getShape(String name){
        return map.get(name);
    }
}
