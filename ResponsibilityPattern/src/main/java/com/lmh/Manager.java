package com.lmh;

/**
 * @author lmh
 * @description: 部门经理类（具体的处理者）
 * @projectName: DesignPatterns
 * @className: GroupLeader
 * @createDate: 2023/10/5 20:54
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("部门经理审批：同意");
    }
}
