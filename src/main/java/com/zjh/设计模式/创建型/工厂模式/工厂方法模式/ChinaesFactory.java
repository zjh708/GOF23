package com.zjh.设计模式.创建型.工厂模式.工厂方法模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 16:43
 * @description:
 */
public class ChinaesFactory implements ICourseFactory {
    public ICouse create() {
        return new ChinaesCouse();
    }
}
