package org.lmh;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author lmh
 * @description: Runtime 是饿汉式单例
 * @projectName: DesignPatterns
 * @className: RuntimeDemo
 * @createDate: 2023/9/23 17:16
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.availableProcessors());
        // 参数是一个命令
        Process process = runtime.exec("ipconfig");
        // 调用Process对象的获取输入流的方法
        InputStream inputStream = process.getInputStream();
        byte[] arr = new byte[1024*1024*1000];
        // 读取数据
        int read = inputStream.read(arr); // 返回读到的字节的个数
        // 将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,read,"GBK"));
    }
}
