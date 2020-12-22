package com.zjh.设计模式.创建型.单例模式.懒汉式.普通懒汉式01;

import java.io.Serializable;

/**
 * @author 锦zero
 * @date 2020-12-21 11:35
 * @description: 为了解决饿汉式单例可能带来的内存浪费问题, 于是就出现了懒汉式单例的写法, 懒汉式单例模式的特点是, 单例对象要在被使用时才会初始化,
 */
public class LazySimpleSingleton implements Serializable {
    private static LazySimpleSingleton lazySimpleSingleton;


    private LazySimpleSingleton() {
        if (lazySimpleSingleton != null) {
            throw new RuntimeException("不允许创建 多个实例");
        }
    }


    /**
     * 01 多线程下会产生多个实例
     * public static LazySimpleSingleton getLazySimpleSingleton() {
     * if (lazySimpleSingleton == null) {
     * lazySimpleSingleton = new LazySimpleSingleton();
     * }
     * return lazySimpleSingleton;
     * }
     */

    /* 02 线程过多时会造成线程过多堵塞   程序性能下降
    public synchronized static LazySimpleSingleton getLazySimpleSingleton() {
        if (lazySimpleSingleton == null) {
            lazySimpleSingleton = new LazySimpleSingleton();
        }
        return lazySimpleSingleton;
    }
    */

     //03  缩小锁范围  但是总归是用了synchronized 对程序性能还是会存在影响
    public static LazySimpleSingleton getLazySimpleSingleton() {
        if (lazySimpleSingleton == null) {
            synchronized (LazySimpleSingleton.class) {
                if (lazySimpleSingleton == null) {

                    lazySimpleSingleton = new LazySimpleSingleton();
                }
            }
        }
        return lazySimpleSingleton;
    }

   /*
    private LazySimpleSingleton() {
        //防止反射破坏单例
        if (LayzHolder.LAZY != null) {
            throw new RuntimeException("不允许创建 多个实例");
        }
    }

    //04
    //每一个关键字都不是多余的, static是为了使单例的空间共享,保证这个方法不会被重写、重载
    public static final LazySimpleSingleton getLazySimpleSingleton() {
        //在返回结果以前一定会先加载内部类
        return LayzHolder.LAZY;
    }

    //默认不加载
    public static class LayzHolder {
        private static LazySimpleSingleton LAZY = new LazySimpleSingleton();
    }
    //
    public Object readResolve(){
        return LayzHolder.LAZY;
    }
*/
}
