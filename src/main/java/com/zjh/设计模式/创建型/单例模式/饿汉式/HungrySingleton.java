package com.zjh.设计模式.创建型.单例模式.饿汉式;

/**
 * @author 锦zero
 * @date 2020-12-21 11:28
 * @description: 饿汉式单例模式在类加载的时候就立即初始化,并且创建单例对象。它绝对线程安全,在线程还没出现以前就实例化了,不可能存在访问安全问题。
 * 钱汉式单例模式适用于单例对象较少的情况。这样写可以保证绝对线程安全、执行效率比较高。但是它的缺点也很明显,就是所有对象类加载的时候就实例化。
 * 这样一来,如果系统中有大批量的单例对象存在,那系统初始化是就会导致大量的内存浪费。也就是说,不管对象用与不用都占着空间,浪费了内存,有可能“占着茅坑不拉屎"。
 *
 */
public class HungrySingleton {

    private static HungrySingleton hungrySingleton =new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}
