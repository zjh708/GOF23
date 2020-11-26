package com.zjh.设计模式.设计原则.B依赖倒置原则;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-11-26 11:16
 * @description: 小明学习类
 */
public class XIaoMin {
    private ICourse iCourse;

    public void study() {
        iCourse.study();
    }

    /*--------set构造注入----------*/
    public XIaoMin() {
    }

    public void study(ICourse course) {
        this.iCourse = course;
    }
    /*--------构造注入----------*/


    public XIaoMin(ICourse course) {
        this.iCourse = course;
    }


}
