package com.lmh.深克隆;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(baos);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            oos.writeObject(this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            oos.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new ByteArrayInputStream(baos.toByteArray()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            Citation o = (Citation) ois.readObject();
            return o;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public String toString() {
        return "Citation{" +
                "student=" + student +
                '}';
    }
}
