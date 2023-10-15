package com.lmh.controller;

import com.lmh.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: UserController
 * @createDate: 2023/10/15 16:28
 */
public class UserController {
    public static void main(String[] args) {
        // 创建spring的容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 从容器对象中获取userservice对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        // 调用UserService方法进行逻辑处理
        userService.add();
    }
}
