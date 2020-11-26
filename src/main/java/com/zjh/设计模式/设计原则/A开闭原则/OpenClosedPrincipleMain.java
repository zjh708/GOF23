package com.zjh.设计模式.设计原则.A开闭原则;

/**
 * @Author 锦zero
 * @Date 2020/11/26 9:51
 * @Description: 开闭原则（Open-Closed Principle, OCP）是指一个软件实体如类、模块和函数应该对扩展开放，
 * 对修改关闭。所谓的开闭，也正是对扩展和修改两个行为的一个原则。强调的是用抽象构建框架，用实 现扩展细节。
 * 可以提高软件系统的可复用性及可维护性。开闭原则，是面向对象设计中最基础的设计原 则。它指导我们如何建立稳定灵活的系统，
 * 例如：我们版本更新，我尽可能不修改源代码，但是可以增 加新功能。 在现实生活中对于开闭原则也有体现。
 * 比如，很多互联网公司都实行弹性制作息时间，规定每天工作 8 小时。意思就是说，对于每天工作 8 小时这个规定是关闭的，
 * 但是你什么时候来，什么时候走是开放的。早来早走，晚来晚走。 实现开闭原则的核心思想就是面向抽象编程，
 */
public class OpenClosedPrincipleMain {
    /**
    *@Description: 列子解释 :一个补课课程类ICourse 有课程id  课程名字name  补课价格price
     *                     语文课CineseCouse
     *                     价格优惠。如果修改 CineseCouse 中的 getPrice()方法，则会 存在一定的风险，可能影响其他地方的调用结果。
     *                     我们如何在不修改原有代码前提前下，实现价格优惠 这个功能呢？现在，我们再写一个处理优惠逻辑的类
    */
    public static void main(String[] args) {
        ChineseDiscountCourse course = new ChineseDiscountCourse(1, "语文课", 200d);
        System.out.println("课程名字" + course.getName());
        System.out.println("课程原价" + course.getOldPrice());
        System.out.println("课程现价" + course.getPrice());
    }

}
