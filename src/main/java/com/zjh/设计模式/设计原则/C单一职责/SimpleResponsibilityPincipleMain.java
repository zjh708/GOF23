package com.zjh.设计模式.设计原则.C单一职责;

import com.zjh.设计模式.设计原则.C单一职责.old.Course;
import com.zjh.设计模式.设计原则.C单一职责.old2.LiveCourse;
import com.zjh.设计模式.设计原则.C单一职责.old2.ReplayCourse;

/**
 * @program: GOF23
 * @author: 锦zero
 * @create: 2020-11-26 14:08
 * @description:单一职责（Simple Responsibility Pinciple，SRP）是指不要存在多于一个导致类变更的原因。
 * 假 设我们有一个 Class 负责两个职责，一旦发生需求变更，修改其中一个职责的逻辑代码，有可能会导致 另一个职责的功能发生故障。
 * 这样一来，这个 Class 存在两个导致类变更的原因。如何解决这个问题呢？ 我们就要给两个职责分别用两个 Class 来实现，进行解耦。
 * 后期需求变更维护互不影响。这样的设计， 可以降低类的复杂度，提高类的可读性，提高系统的可维护性，降低变更引起的风险。
 * 总体来说就是一 个 Class/Interface/Method 只负责一项职责。
 */
public class SimpleResponsibilityPincipleMain {
    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
        //从上面代码来看，Course 类承担了两种处理逻辑。假如，现在要对课程进行加密，那么直播课和录 播课的加密逻辑都不一样，
        // 必须要修改代码。而修改代码逻辑势必会相互影响容易造成不可控的风险。 我们对职责进行分离解耦，来看代码，
        // 分别创建两个类 ReplayCourse 和 LiveCourse
        System.out.println("-----------------------------");
        LiveCourse liveCourse = new LiveCourse();
        liveCourse.study("直播课");
        ReplayCourse replayCourse = new ReplayCourse();
        replayCourse.study("录播课");
        //业务继续发展，课程要做权限。没有付费的学员可以获取课程基本信息，已经付费的学员可以获得 视频流，即学习权限。
        // 那么对于控制课程层面上至少有两个职责。我们可以把展示职责和管理职责分离 开来，都实现同一个抽象依赖。
        // 设计一个顶层接口,创建 ICourse 接口

    }
}
