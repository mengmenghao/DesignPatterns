package com.lmh;

/**
 * @author lmh
 * @description: 组合模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/3 0:30
 */
public class Client {
    public static void main(String[] args) {
        // 创建菜单树
        MenuComponent menuComponent=new Menu("菜单管理",2);
        menuComponent.add(new MenuItem("页面访问",3));
        menuComponent.add(new MenuItem("展开菜单",3));
        menuComponent.add(new MenuItem("编辑菜单",3));
        menuComponent.add(new MenuItem("删除菜单",3));
        menuComponent.add(new MenuItem("新增菜单",3));
        MenuComponent menuComponent2=new Menu("权限管理",2);
        menuComponent2.add(new MenuItem("页面访问",3));
        menuComponent2.add(new MenuItem("提交保存",3));
        MenuComponent menuComponent3=new Menu("角色管理",2);
        menuComponent3.add(new MenuItem("页面访问",3));
        menuComponent3.add(new MenuItem("新增角色",3));
        menuComponent3.add(new MenuItem("修改角色",3));

        // 创建一级菜单
        MenuComponent component = new Menu("系统管理",1);
        // 将二级添加到一级
        component.add(menuComponent);
        component.add(menuComponent2);
        component.add(menuComponent3);

        component.print();
    }
}
