package com.zjh.设计模式.创建型.单例模式.懒汉式.普通懒汉式01;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 锦zero
 * @date 2020-12-21 11:50
 * @description:
 */
public class LazySimpleSingletonMain {
  /*  //01-03
    public static void main(String[] args) {
        Thread thread = new Thread(new ExectorThread());
        Thread thread1 = new Thread(new ExectorThread());
        thread.start();
        thread1.start();
        System.out.println("end");

        // 反射破坏单例
        Class<?> clazz = LazySimpleSingleton.class;
        try {
            //反射获取私有构造方法
            Constructor<?> constructor = clazz.getDeclaredConstructor(null);
            //暴力反射调用
            constructor.setAccessible(true);
            Object o = constructor.newInstance();
            Object o2 = constructor.newInstance();
            System.out.println(o == o2);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }*/
    /*
    //序列化破坏单例
    public static void main(String[] args) {
        LazySimpleSingleton lazySimpleSingleton = LazySimpleSingleton.getLazySimpleSingleton();

        LazySimpleSingleton lazySimpleSingleton2 = null;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("LazySimpleSingleton.obj");
            ObjectOutputStream oos=new ObjectOutputStream(fileOutputStream);
            oos.writeObject(lazySimpleSingleton);
            oos.flush();
            oos.close();
            FileInputStream fis=new FileInputStream("LazySimpleSingleton.obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            lazySimpleSingleton2 = (LazySimpleSingleton) ois.readObject();
            ois.close();
            System.out.println(lazySimpleSingleton==lazySimpleSingleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
*/

}