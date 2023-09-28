package com.lmh;

/**
 * @author lmh
 * @description: avi视频文件 （具体的实现化角色）
 * @projectName: DesignPatterns
 * @className: AviFile
 * @createDate: 2023/9/28 18:44
 */
public class AviFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
