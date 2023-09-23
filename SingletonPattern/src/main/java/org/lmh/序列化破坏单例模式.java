package org.lmh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author lmh
 * @description: 序列化破坏单例模式  --解决方法：在单例上添加readResolve方法的实现，例：Singleton5
 * @projectName: DesignPatterns
 * @className: 序列化破坏单例模式
 * @createDate: 2023/9/23 16:42
 */
public class 序列化破坏单例模式 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        writeObject2File();
        readObjectFromFile();
        readObjectFromFile();
    }

    // 从文件中读取数据（对象）
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
        // 1、创建对象输入流对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\projects\\java\\DesignPatterns\\SingletonPattern\\src\\main\\java\\org\\lmh\\a.txt"));
        // 2、读取对象
        Singleton5 o =(Singleton5) objectInputStream.readObject();
        System.out.println(o);
        // 3、释放资源
        objectInputStream.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        // 1、获取Singleton对象
        Singleton5 instance = Singleton5.getInstance();
        // 2、创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\projects\\java\\DesignPatterns\\SingletonPattern\\src\\main\\java\\org\\lmh\\a.txt"));
        // 3、写对象
        oos.writeObject(instance);
        // 4、释放资源
        oos.close();
    }
}
