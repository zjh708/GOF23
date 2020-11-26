package com.zjh.设计模式.设计原则.B依赖倒置原则;

/**
 * @program: GOF23
 * @description: 语文课程
 * @author: 锦zero
 * @create: 2020-11-26 10:36
 */
public class MathematicsCourse implements ICourse {

    public void study() {
        System.out.println("xiaomin 在学习 Mathematics 课程");
    }
}
