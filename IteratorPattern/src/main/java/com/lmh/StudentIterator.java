package com.lmh;

/**
 * @author lmh
 * @description: 抽象迭代器角色接口
 * @projectName: DesignPatterns
 * @className: StudentIterator
 * @createDate: 2023/10/14 22:09
 */
public interface StudentIterator {
    // 判断是否还有元素
    boolean hasNext();

    // 获取下一个元素
    Student next();
}
