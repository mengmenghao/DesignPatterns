package com.lmh;


/**
 * @author lmh
 * @description: 抽象表达式
 * @projectName: DesignPatterns
 * @className: AbstractExpression
 * @createDate: 2023/10/15 15:55
 */
public abstract class AbstractExpression {
    public abstract int interpret(Context context);
}
