package com.lmh;

/**
 * @author lmh
 * @description: 责任链模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/5 20:59
 */
public class Client {
    public static void main(String[] args) {
        LeaveRequest leaveRequest = new LeaveRequest("小米", 1, "身体不适");
        // 创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 小米提交请假申请
        groupLeader.submit(leaveRequest);
    }
}
