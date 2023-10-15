package com.lmh;

/**
 * @author lmh
 * @description: 减法表达式
 * @projectName: DesignPatterns
 * @className: Plus
 * @createDate: 2023/10/15 16:00
 */
public class Minus extends AbstractExpression{
    // -左边的表达式
    private AbstractExpression left;
    // -右边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        // 将左边表达式的结果和右边表达式的结果进行相加
        return left.interpret(context) - left.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + "-" + right.toString() + ")";
    }
}
