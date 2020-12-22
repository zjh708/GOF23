package com.zjh.设计模式.创建型.单例模式.懒汉式.普通懒汉式01;

/**
 * @author 锦zero
 * @date 2020-12-21 11:48
 * @description:
 */
public class ExectorThread implements Runnable{
    public void run() {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getLazySimpleSingleton();
        System.out.println(lazySimpleSingleton.getClass().getName()+":"+lazySimpleSingleton);
    }
}
