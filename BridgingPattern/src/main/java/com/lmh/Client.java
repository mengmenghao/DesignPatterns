package com.lmh;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: Client
 * @createDate: 2023/9/28 19:58
 */
public class Client {
    public static void main(String[] args) {
        OpratingSystem system = new Mac(new AviFile());
        system.play("sss");
    }
}
