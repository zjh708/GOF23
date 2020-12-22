package com.zjh.设计模式.创建型.工厂模式.工厂方法模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 15:10
 * @description: 指定义一个创建对象的接口，但让实现这个接口的类来决定实例化哪个类，工厂方法让类的实例化推迟到子类重进行
 * 在工厂方法模式中用户需要关心所需产品对应的工厂，无需关心创建细节，而且加入新的产品符合开闭原则
 * 工厂方法适用以下场景：
 *  1、创建对象需要大量重复的代码。2、客户端(应用层)不依赖于产品类实例如何被创建、实现等细节。3、一个类通过其子类来指定创建哪个对象。
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        ICourseFactory chinaesFactory = new ChinaesFactory();
        ICouse iCouse = chinaesFactory.create();
        iCouse.record();
    }
}
