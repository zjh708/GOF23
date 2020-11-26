package com.zjh.设计模式.设计原则.A开闭原则;

/**
 * @program: GOF23
 * @description: 语文课程价格优惠类
 * @author: 锦zero
 * @create: 2020-11-26 10:45
 */
public class ChineseDiscountCourse extends ChineseCourse {

    public ChineseDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * @Description: 获取没优惠的价格
     */
    public Double getOldPrice() {
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        //打五折 别杠精 0.5可以灵活做成配置的或者别的方式取值或者传参
        return super.getPrice() * 0.5;
    }

}
