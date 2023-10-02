package com.lmh;

/**
 * @author lmh
 * @description: 菜单项类：属于叶子结点
 * @projectName: DesignPatterns
 * @className: MenuItem
 * @createDate: 2023/10/3 0:26
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name,int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("--");
        }
        System.out.println(name);
    }
}
