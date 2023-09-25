package com.lmh.demo1;

/**
 * @author lmh
 * @description: 产品对象
 * @projectName: DesignPatterns
 * @className: Bike
 * @createDate: 2023/9/25 17:13
 */
public class Bike {
    private String frame;// 车架
    private String seat; // 车库

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
