package com.lmh;

/**
 * @author lmh
 * @description: 封装变量的类
 * @projectName: DesignPatterns
 * @className: Variable
 * @createDate: 2023/10/15 15:58
 */
public class Variable extends AbstractExpression{
    // 声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        // 直接返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
