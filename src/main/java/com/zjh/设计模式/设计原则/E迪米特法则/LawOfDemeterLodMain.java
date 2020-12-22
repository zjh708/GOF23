package com.zjh.设计模式.设计原则.E迪米特法则;

import com.zjh.设计模式.设计原则.E迪米特法则.old.Employee;
import com.zjh.设计模式.设计原则.E迪米特法则.old.TeamLeader;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-11-26 17:14
 * @description: 迪米特原则（Law of Demeter LoD）是指一个对象应该对其他对象保持最少的了解，又叫最少知 道原则（Least Knowledge Principle,LKP），
 * 尽量降低类与类之间的耦合。迪米特原则主要强调只和朋友交流，不和陌生人说话。出现在成员变量、方法的输入、输出参数中的类都可以称之为成员朋友类，
 * 而出现在方法体内部的类不属于朋友类。
 */
public class LawOfDemeterLodMain {

    public static void main(String[] args) {
        //现在来设计一个权限系统，TeamLeader需要查看目前发布到线上的课程数量。
        //这时候，TeamLeader 要找到员工 Employee 去进行统计，Employee 再把统计结果告诉 TeamLeader。接下来我们还是来看
        TeamLeader teamLeader = new TeamLeader();
        Employee employee = new Employee();
        teamLeader.commandCheckNumber(employee);
        //。根据迪米特原则，TeamLeader 只想要结果，不需要跟 Course 产生直接的交流。而 Employee 统计需要引用 Course 对象。
        // TeamLeader 和 Course 并不是朋友，查看关系类图就可以看出来


    }

}
