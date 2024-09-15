package com.SIS;

import java.util.ArrayList;
import java.util.List;

public class Student implements IStudent {
    private String name;
    private int id;
    private List<ICourse> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public List<ICourse> getEnrolledCourses() {
        return enrolledCourses;
    }

    @Override
    public void enrollInCourse(ICourse course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getCourseName());
    }
}
