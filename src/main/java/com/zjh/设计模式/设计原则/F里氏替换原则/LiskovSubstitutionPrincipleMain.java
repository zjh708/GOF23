package com.zjh.设计模式.设计原则.F里氏替换原则;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-12-14 10:26
 * @description: 指如果对每一个类型为 T1 的对象 o1,都有 类型为 T2 的对象 o2,使得以 T1 定义的所有程序 P 在所有的对象 o1
 * 都替换成 o2 时，程序 P 的行为没 有发生变化，那么类型 T2 是类型 T1 的子类型
 * （可以理解为一个软件实体如果适用一个父类的话， 那一定是适用于其子类，所有引用父类的地方必须能透明地使用其子类的对象，
 * 子类对象能够替换父类 对象，而程序逻辑不变。根据这个理解，我们总结一下： 引申含义：子类可以扩展父类的功能，但不能改变父类原有的功能。
 * 1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
 * 2、子类中可以增加自己特有的方法。
 * 3、当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类方法的输入 参数更宽松。
 * 4、当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的输 出/返回值）要比父类更严格或相等。）
 * 优点：1、约束继承泛滥，开闭原则的一种体现。
 * 2、加强程序的健壮性，同时变更时也可以做到非常好的兼容性，提高程序的维护性、扩展性。降低 需求变更时引入的风险。
 */
public class LiskovSubstitutionPrincipleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);

    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
        }
        System.out.println("Resize End,Width:" + rectangle.getWidth() + ",Height:" + rectangle.getHeight());
    }
}


interface QuadRangle {
    long getWidth();

    long getHeight();
}

//现在来描述一个经典的业务场景，用正方形、矩形和四边形的关系说明里氏替换原则，我们都知道 正方形是一个特殊的长方形，
// 那么就可以创建一个长方形父类 Rectangle 类：
class Rectangle implements QuadRangle {
    private long height;
    private long width;

    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}

//创建正方形 Square 类继承长方形：
class Square implements QuadRangle {
    private long length;

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWidth() {
        return length;
    }

    public long getHeight() {
        return length;
    }
}