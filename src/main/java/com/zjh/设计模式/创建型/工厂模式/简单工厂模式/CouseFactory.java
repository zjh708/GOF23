package com.zjh.设计模式.创建型.工厂模式.简单工厂模式;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 14:22
 * @description: 简单工程模式工厂里类
 */
public class CouseFactory {

    public static ICouse create(Class<? extends ICouse> clazz) {
        ICouse iCouse = null;
        try {
            iCouse = clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return iCouse;
    }
}
