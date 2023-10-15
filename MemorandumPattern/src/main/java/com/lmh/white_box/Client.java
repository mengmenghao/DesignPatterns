package com.lmh.white_box;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/15 14:25
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("-------------大战boss前---------------------");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        // 初始化状态操作
        gameRole.initState();
        gameRole.stateDisplay();

        // 将该游戏角色状态进行备份
        // 创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("-------------大战boss后---------------------");

        // 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("-------------恢复之前的状态---------------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
