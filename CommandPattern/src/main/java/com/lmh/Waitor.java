package com.lmh;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lmh
 * @description: 服务员类（属于请求者角色）
 * @projectName: DesignPatterns
 * @className: Waitor
 * @createDate: 2023/10/5 19:48
 */
public class Waitor {
    // 持有多个命令对象
    private List<Command> commands = new ArrayList<>();

    public void setCommand(Command command) {
        // 将cmd对象存储到list集合中
        commands.add(command);
    }

    // 发起命令的方法 喊订单来了
    public void orderUp() {
        System.out.println("美女服务员：大厨，新订单来了。。。。");
        // 遍历list集合
        for (Command command : commands) {
            if (command != null) {
                command.execute();
            }
        }
    }

}
