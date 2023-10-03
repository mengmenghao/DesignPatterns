package com.lmh;

/**
 * @author lmh
 * @description: O图形类（具体享元角色）
 * @projectName: DesignPatterns
 * @className: IBox
 * @createDate: 2023/10/3 17:46
 */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
