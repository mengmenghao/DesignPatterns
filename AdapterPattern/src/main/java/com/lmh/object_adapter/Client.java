package com.lmh.object_adapter;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/28 16:31
 */
public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        String s = computer.readSD(new SDCardImpl());
        System.out.println(s);

        System.out.println("--------------");

        SDAdapterTF sdAdapterTF = new SDAdapterTF(new TFCardImpl());
        String s1 = computer.readSD(sdAdapterTF);
        System.out.println(s1);

    }
}
