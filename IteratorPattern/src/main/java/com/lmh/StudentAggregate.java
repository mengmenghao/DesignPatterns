package com.lmh;

/**
 * @author lmh
 * @description: 抽象聚合角色接口
 * @projectName: DesignPatterns
 * @className: StudentAggregate
 * @createDate: 2023/10/14 22:13
 */
public interface StudentAggregate {
    // 添加学生功能
    void addStudent(Student stu);
    // 删除学生功能
    void removeStudent(Student stu);
    // 获取迭代器对象功能
    StudentIterator getStudentIterator();
}
