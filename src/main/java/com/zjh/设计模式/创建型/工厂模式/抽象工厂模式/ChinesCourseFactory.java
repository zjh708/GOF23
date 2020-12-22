package com.zjh.设计模式.创建型.工厂模式.抽象工厂模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-15 11:34
 * @description:
 */
public class ChinesCourseFactory extends AbstractCourseFactory{
    protected INote createNote() {
        super.init();
        return new ChinesNote();
    }

    protected IVideo createVideo() {
        super.init();
        return new ChinesVideo();
    }
}
