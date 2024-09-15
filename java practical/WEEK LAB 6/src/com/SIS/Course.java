package com.SIS;

import java.util.ArrayList;
import java.util.List;

public class Course implements ICourse {
    private String courseName;
    private int courseID;
    private List<IStudent> enrolledStudents;

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.enrolledStudents = new ArrayList<>();
    }

    @Override
    public String getCourseName() {
        return courseName;
    }

    @Override
    public int getCourseID() {
        return courseID;
    }

    @Override
    public List<IStudent> getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public void enrollStudent(IStudent student) {
        enrolledStudents.add(student);
        System.out.println(student.getName() + " enrolled in " + courseName);
    }
}
