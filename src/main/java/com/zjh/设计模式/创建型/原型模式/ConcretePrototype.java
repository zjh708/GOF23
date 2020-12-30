package com.zjh.设计模式.创建型.原型模式;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * @author 锦zero
 * @date 2020-12-23 14:39
 * @description:
 */
@Data
//手动实现
//public class ConcretePrototype implements IPrototype<ConcretePrototype> {
//jdk浅克隆
//public class ConcretePrototype implements Cloneable {
//增加序列化实现深克隆
public class ConcretePrototype implements Cloneable, Serializable {
    private int age;
    private String name;
    private List<String> hobbies;

    //手工实现
    /*public ConcretePrototype clone() {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        return concretePrototype;
    }
*/
    //jdk浅克隆
    @Override
    protected ConcretePrototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype)super.clone();
    }
    //增加序列化实现深克隆
    protected ConcretePrototype deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ConcretePrototype) ois.readObject();
    }
    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}