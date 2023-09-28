package com.lmh;

/**
 * @author lmh
 * @description: 扩展抽象化角色（windows操作系统）
 * @projectName: DesignPatterns
 * @className: Windows
 * @createDate: 2023/9/28 19:56
 */
public class Windows extends OpratingSystem{
    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
