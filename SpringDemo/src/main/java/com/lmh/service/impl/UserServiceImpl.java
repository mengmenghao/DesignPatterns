package com.lmh.service.impl;

import com.lmh.dao.UserDao;
import com.lmh.service.UserService;

/**
 * @author lmh
 * @description: 业务逻辑层实现类
 * @projectName: DesignPatterns
 * @className: UserServiceImpl
 * @createDate: 2023/10/15 16:27
 */
public class UserServiceImpl implements UserService {
    // 声明一个UserDao类型的变量
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void add() {
        System.out.println("UserService ....");
        userDao.add();
    }
}
