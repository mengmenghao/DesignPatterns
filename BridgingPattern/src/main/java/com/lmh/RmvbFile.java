package com.lmh;

/**
 * @author lmh
 * @description: rmvb视频文件（具体的实现化角色）
 * @projectName: DesignPatterns
 * @className: RmvbFile
 * @createDate: 2023/9/28 18:46
 */
public class RmvbFile implements VideoFile{
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
