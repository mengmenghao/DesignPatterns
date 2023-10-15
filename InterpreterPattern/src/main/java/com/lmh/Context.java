package com.lmh;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lmh
 * @description: 环境角色类
 * @projectName: DesignPatterns
 * @className: Context
 * @createDate: 2023/10/15 15:57
 */
public class Context {
    // 定义一个map集合，用来存储变量及对应的值
    private Map<Variable,Integer> map = new HashMap<>();
    // 添加变量的功能
    public void assign(Variable variable,Integer value){
        map.put(variable,value);
    }

    // 根据变量获取对应的值
    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
