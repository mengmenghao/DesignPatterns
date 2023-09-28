package com.lmh;

/**
 * @author lmh
 * @description: 抽象的操作系统类 （抽象化角色）
 * @projectName: DesignPatterns
 * @className: OpratingSystem
 * @createDate: 2023/9/28 19:54
 */
public abstract class OpratingSystem {
    // 声明videoFile变量
    protected VideoFile videoFile;

    public OpratingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
