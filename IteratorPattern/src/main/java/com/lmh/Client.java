package com.lmh;

/**
 * @author lmh
 * @description: 迭代器模式
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/10/14 22:17
 */
public class Client {
    public static void main(String[] args) {
        // 创建聚合对象
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        // 添加元素
        studentAggregate.addStudent(new Student("张珊","1790001"));
        studentAggregate.addStudent(new Student("李思","1790002"));
        studentAggregate.addStudent(new Student("王五","1790003"));
        studentAggregate.addStudent(new Student("赵六","1790004"));
        studentAggregate.addStudent(new Student("张三丰","1790005"));


        // 遍历聚合对象

        // 1、获取迭代器对象
        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        // 2、遍历
        while (studentIterator.hasNext()) {
            // 3、获取元素
            Student next = studentIterator.next();
            System.out.println(next.toString());
        }
    }
}
