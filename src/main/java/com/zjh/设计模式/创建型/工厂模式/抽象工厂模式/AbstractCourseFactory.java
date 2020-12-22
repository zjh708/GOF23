package com.zjh.设计模式.创建型.工厂模式.抽象工厂模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-15 10:58
 * @description:
 */
public abstract class AbstractCourseFactory {
    public void init() {
        System.out.println("初始化基础数据");
    }

    protected abstract INote createNote();

    protected abstract IVideo createVideo();
}
