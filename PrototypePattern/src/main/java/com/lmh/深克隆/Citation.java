package com.lmh.深克隆;

import java.io.Serializable;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Citation
 * @createDate: 2023/9/25 12:20
 */
public class Citation implements Cloneable, Serializable {

    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public void show() {
        System.out.println(student.getName() + "同学评为三好学生");
    }

    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    @Override
    public String toString() {
        return "Citation{" +
                "student=" + student +
                '}';
    }
}
