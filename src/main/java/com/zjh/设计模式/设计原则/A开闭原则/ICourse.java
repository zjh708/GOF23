package com.zjh.设计模式.设计原则.A开闭原则;

/**
 * @program: GOF23
 * @description: 课程类
 * @author: 锦zero
 * @create: 2020-11-26 10:02
 */
public interface ICourse {
    /**
    *@return:课程id
    *@Description:获取课程id
    */
    Integer getId();
    /**
    *@return:课程名字
    *@Description: 获取课程名字
    */
    String getName();
    /**
    *@return:课程价格
    *@Description: 获取课程价格
    */
    Double getPrice();
}
