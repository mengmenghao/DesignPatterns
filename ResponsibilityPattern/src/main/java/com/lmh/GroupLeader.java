package com.lmh;

/**
 * @author lmh
 * @description: 小组长类（具体的处理者）
 * @projectName: DesignPatterns
 * @className: GroupLeader
 * @createDate: 2023/10/5 20:54
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("小组长审批：同意");
    }
}
