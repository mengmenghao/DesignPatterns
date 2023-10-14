package com.lmh;

import java.util.List;

/**
 * @author lmh
 * @description: 具体迭代器角色类
 * @projectName: DesignPatterns
 * @className: StudentIteratorImpl
 * @createDate: 2023/10/14 22:10
 */
public class StudentIteratorImpl implements StudentIterator {
    private List<Student> list;
    private int position = 0; // 用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        position++;
        return currentStudent;
    }
}
