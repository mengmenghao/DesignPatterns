package com.lmh.white_box;

/**
 * @author lmh
 * @description: 备忘录对象管理对象
 * @projectName: DesignPatterns
 * @className: RoleStateCaretaker
 * @createDate: 2023/10/15 14:24
 */
public class RoleStateCaretaker {
    // 声明备忘录类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
