package com.zjh.设计模式.设计原则.A开闭原则;

/**
 * @program: GOF23
 * @description: 语文课程
 * @author: 锦zero
 * @create: 2020-11-26 10:36
 */
public class ChineseCourse implements ICourse {

    private Integer id;
    private String name;
    private Double price;

    public ChineseCourse(Integer id, String name, Double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }
}
