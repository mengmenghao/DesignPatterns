package com.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/15 16:08
 */
public class Client {
    public static void main(String[] args) {
        // 创建环境对象
        Context context = new Context();
        // 创建多个变量对象
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        // 将变量存储到环境对象中
        context.assign(a,1);
        context.assign(b,2);
        context.assign(c,3);
        context.assign(d,4);

        // 获取抽象语法树 a+b-c+d
        AbstractExpression expression = new Plus(a,new Plus(new Minus(b,c),d));

        // 解释（计算）
        int interpret = expression.interpret(context);
        System.out.println(interpret);
        String string = expression.toString();
        System.out.println(string);
    }
}
