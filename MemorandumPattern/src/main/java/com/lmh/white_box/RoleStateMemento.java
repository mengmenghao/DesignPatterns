package com.lmh.white_box;

/**
 * @author lmh
 * @description: 备忘录角色类（用来存储历史状态）
 * @projectName: DesignPatterns
 * @className: RoleStateMemento
 * @createDate: 2023/10/15 14:16
 */
public class RoleStateMemento {
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
