package com.lmh.black_box;


/**
 * @author lmh
 * @description: 游戏角色类（属于发起人角色）
 * @projectName: DesignPatterns
 * @className: GameRole
 * @createDate: 2023/10/15 14:12
 */
public class GameRole {
    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    // 初始化内部状态
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    // 战斗
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    // 保存角色状态功能
    public Memento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(Memento memento) {
        RoleStateMemento roleStateMemento = (RoleStateMemento) memento;
        // 将备忘录对象中存储的状态赋值给当前对象的成员
        this.def = roleStateMemento.getDef();
        this.atk = roleStateMemento.getAtk();
        this.vit = roleStateMemento.getVit();
    }

    // 展示状态功能
    public void stateDisplay(){
        System.out.println("角色生命力：" +vit);
        System.out.println("角色攻击力：" +atk);
        System.out.println("角色防御力：" +def);
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public class RoleStateMemento implements Memento{
        // 生命力
        private int vit;
        // 攻击力
        private int atk;
        // 防御力
        private int def;


        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }


        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }
    }
}
