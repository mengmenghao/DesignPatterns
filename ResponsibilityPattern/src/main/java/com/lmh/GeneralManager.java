package com.lmh;

/**
 * @author lmh
 * @description: 部门总经理类（具体的处理者）
 * @projectName: DesignPatterns
 * @className: GroupLeader
 * @createDate: 2023/10/5 20:54
 */
public class GeneralManager extends Handler {

    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handlerLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天" + leaveRequest.getContent());
        System.out.println("部门总经理审批：同意");
    }
}
