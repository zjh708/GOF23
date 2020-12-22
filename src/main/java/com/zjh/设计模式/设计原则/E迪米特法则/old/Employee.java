package com.zjh.设计模式.设计原则.E迪米特法则.old;

import java.util.List;

public class Employee {
    public void checkNumberOfCourses(List<Course> courseList) {
        System.out.println("目前已发布的课程数量是：" + courseList.size());
    }
}