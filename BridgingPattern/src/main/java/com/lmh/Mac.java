package com.lmh;

/**
 * @author lmh
 * @description: 扩展抽象化角色（mac操作系统）
 * @projectName: DesignPatterns
 * @className: Mac
 * @createDate: 2023/9/28 19:57
 */
public class Mac extends OpratingSystem{
    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
