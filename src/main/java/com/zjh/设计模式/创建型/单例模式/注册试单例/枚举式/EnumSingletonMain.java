package com.zjh.设计模式.创建型.单例模式.注册试单例.枚举式;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 锦zero
 * @date 2020-12-22 10:34
 * @description:
 */
public class EnumSingletonMain {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {


        EnumSingleton enumSingleton = EnumSingleton.getInstance();

        EnumSingleton enumSingleton2 = null;
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream("EnumSington.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(enumSingleton);
            oos.flush();
            oos.close();
            FileInputStream fis = new FileInputStream("EnumSington.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            enumSingleton2 = (EnumSingleton) ois.readObject();
            ois.close();
            System.out.println(enumSingleton == enumSingleton2);

        } catch (Exception e) {
            e.printStackTrace();
        }
        // 我们看到,在readobjecto中调用了readEnum方法,来看readEnum0方法的代码实现:
        //我们发现,枚举类型其实通过类名和类对象类找到一个唯一的枚举对象。
        // 因此,枚举对象不可能被类加载器加载多次。
        // 那么反射是否能破坏枚举式单例模式呢?来看一段测试代码:
        Class<?> clazz = EnumSingleton.class;

        //Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(null);
        //结果中报的是java.lang.NoSuchMethodException异常,意思是没找到无参的构造方法。
        // 这时候,我们打开java.lang.Enum的源码,查看它的构造方法,只有一个protected类型的构造方法
        // （protected Enum(string name, int ordinal) { this.name = name;this.ordinal = ordinal;}）,
        //增加暴力反射
        Constructor<?> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton instance = (EnumSingleton) declaredConstructor.newInstance();
        //Cannot reflectively create enum objects
        //	at java.lang.reflect.Constructor.newInstance(Constructor.java:417)直接报错枚举类无法反射创建实例
        //newInstance里判断了如果是枚举类型直接抛出异常
    }
}
