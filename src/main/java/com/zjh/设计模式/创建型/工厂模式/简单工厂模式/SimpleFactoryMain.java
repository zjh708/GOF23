package com.zjh.设计模式.创建型.工厂模式.简单工厂模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 14:41
 * @description: 指由一个工厂对象决定创建出哪一种产品实例，但它不属于gof23设计模式，简单工厂模式适用于工厂类负责创建对象较少的场景，
 * 且客户端只需要传入工厂类的参数，对于如何创建对象的逻辑不需要关心
 */
public class SimpleFactoryMain {

    public static void main(String[] args) {
        ICouse couse = CouseFactory.create(ChinaesCouse.class);
        couse.record();
    }
}

