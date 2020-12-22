package com.zjh.设计模式.设计原则.E迪米特法则.old;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void commandCheckNumber(Employee employee) {
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        employee.checkNumberOfCourses(courseList);
    }
}