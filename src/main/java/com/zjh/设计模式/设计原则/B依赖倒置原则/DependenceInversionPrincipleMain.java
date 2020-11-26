package com.zjh.设计模式.设计原则.B依赖倒置原则;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-11-26 11:06
 * @description:依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模块不应该依 赖底层模块，
 * 二者都应该依赖其抽象。抽象不应该依赖细节；细节应该依赖抽象。通过依赖倒置，可以 减少类与类之间的耦合性，提高系统的稳定性，
 * 提高代码的可读性和可维护性， 并能够降低修改程序所 造成的风险
 */
public class DependenceInversionPrincipleMain {

    /**
     * @Description: 一样补课班的例子；
     * XiaoMin 热爱学习，目前正在学习 数学 课程和 语文 课程。大家都知道，学习也是会上瘾的。随着 学习兴趣的暴涨，
     * 现在 XiaoMin 还想学习 英语的课程。这个时候，业务扩展，我们的代码要从底层 到高层（调用层）一次修改代码。
     * 在 XiaoMin 类中增加 studyAICourse()的方法，在高层也要追加调用。
     * 如此一来，系统发布以后，实际上是非常不稳定的，在修改代码的同时也会带来意想不到的风险。
     * <p>
     * 改造代码，创建一个课程的抽象 ICourse 接口  修改xiaomin类 (xiaominold->xiaomin)  xiaomin增加兴趣想学什么课程只要实现ICourse即可
     *
     */
    public static void main(String[] args) {
        //未改造前的调用
       /* XIaoMinOld xiaoMin = new XIaoMinOld();
        xiaoMin.studyChineseCourse();
        xiaoMin.studyMathematicsCourse();*/
        //set注入
       /* XIaoMin xIaoMin = new XIaoMin();
        xIaoMin.study(new ChineseCourse());
        xIaoMin.study(new MathematicsCourse());*/
        //构造注入
        XIaoMin xIaoMin2 = new XIaoMin(new ChineseCourse());
        xIaoMin2.study();
        XIaoMin xIaoMin3 = new XIaoMin(new MathematicsCourse());
        xIaoMin3.study();
        //根据构造器方式注入，在调用时，每次都要创建实例。那么，如果 Tom 是全局单例，则我们就只能 选择用 Setter 方式来注入，
        XIaoMin xIaoMin4 = new XIaoMin();
        xIaoMin4.study(new ChineseCourse());
        xIaoMin4.study();
        xIaoMin4.study(new MathematicsCourse());
        xIaoMin4.study();

    }

}
