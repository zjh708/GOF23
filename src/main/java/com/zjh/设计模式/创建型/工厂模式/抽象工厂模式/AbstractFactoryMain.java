package com.zjh.设计模式.创建型.工厂模式.抽象工厂模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 17:21
 * @description: 提供一个创建一系列相关或相互依赖对象的接口，无需指定他们具体的类。
 * 客户端（应用层）不依赖产品如何实例被创建、实现等细节，强调一系列相关的产品对象（）属于同一产品族
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractCourseFactory courseFactory = new ChinesCourseFactory();
        INote note = courseFactory.createNote();
        IVideo video = courseFactory.createVideo();
        note.edit();
        video.record();

    }
}

