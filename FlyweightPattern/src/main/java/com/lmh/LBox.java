package com.lmh;

/**
 * @author lmh
 * @description: L图形类（具体享元角色）
 * @projectName: DesignPatterns
 * @className: IBox
 * @createDate: 2023/10/3 17:46
 */
public class LBox extends AbstractBox{
    @Override
    public String getShape() {
        return "L";
    }
}
