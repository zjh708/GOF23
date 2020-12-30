package com.zjh.设计模式.创建型.原型模式;

import java.util.Arrays;
import java.util.List;

/**
 * @author 锦zero
 * @date 2020-12-23 14:17
 * @description: 原型模式的核心在于拷贝原型对象。以系统中已存在的一个对象为原型,直接基于内存二进制流进·行拷贝,
 * 无需再经历耗时的对象初始化过程(不调用构造函数) ,性能提升许多。当对象的构建过程比较耗时时,
 * 可以利用当前系统中已存在的对象作为原型,对其进行克隆(一般是基于二进制流的复制) ,
 */
public class PrototypeMain {
    public static void main(String[] args) throws Exception {
        List list = Arrays.asList("爬山","唱歌","学习");
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setName("小熊");
        concretePrototype.setAge(18);
        concretePrototype.setHobbies(list);
        ConcretePrototype clone = concretePrototype.clone();
        System.out.println(concretePrototype);
        System.out.println(clone);
        System.out.println(clone == concretePrototype);
        System.out.println(clone.getHobbies() == concretePrototype.getHobbies());
        //---------深克隆
        ConcretePrototype concretePrototype1 = concretePrototype.deepClone();
        System.out.println(clone == concretePrototype1);
        System.out.println(clone.getHobbies() == concretePrototype1.getHobbies());
    }
}
/**
 * 优点:
 * 1、性能优良, Java自带的原型模式是基于内存二进制流的拷贝,比直接new一个对象性能上提升了许多。
 * 2、可以使用深克隆方式保存对象的状态,使用原型模式将对象复制一份并将其状态保存起来,简化了创建对象的过程,以便在需要的时候使用(例如恢复到历史某一状态),可辅助实现撤销操作。
 * 缺点:
 * 1、需要为每一个类配置一个克隆方法。
 * 2、克隆方法位于类的内部,当对已有类进行改造的时候,需要修改代码,违反了开闭原则。
 * 3、在实现深克隆时需要编写较为复杂的代码,而且当对象之间存在多重嵌套引用时,为了实现深克隆,每一层对象对应的类都必须支持深克隆,实现起来会比较麻烦。因此,深拷贝、浅拷贝需要运用得当
 */
