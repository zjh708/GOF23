package com.zjh.设计模式.设计原则.E迪米特法则;

import com.zjh.设计模式.设计原则.E迪米特法则.old.Course;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public void checkNumberOfCourses() {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("目前已发布的课程数量是：" + courseList.size());
    }
}
