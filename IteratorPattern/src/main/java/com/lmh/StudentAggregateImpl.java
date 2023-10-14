package com.lmh;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.List;

/**
 * @author lmh
 * @description: 具体聚合角色
 * @projectName: DesignPatterns
 * @className: StudentAggregateImpl
 * @createDate: 2023/10/14 22:15
 */
public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();
    @Override
    public void addStudent(Student stu) {
        list.add(stu);
    }

    @Override
    public void removeStudent(Student stu) {
        list.remove(stu);
    }

    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
