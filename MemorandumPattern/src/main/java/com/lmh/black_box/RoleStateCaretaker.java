package com.lmh.black_box;

import com.lmh.white_box.RoleStateMemento;

/**
 * @author lmh
 * @description: 备忘录对象管理对象
 * @projectName: DesignPatterns
 * @className: RoleStateCaretaker
 * @createDate: 2023/10/15 14:24
 */
public class RoleStateCaretaker {
    // 声明备忘录类型的变量
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
