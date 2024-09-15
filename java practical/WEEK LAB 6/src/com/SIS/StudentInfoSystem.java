package com.SIS;

public class StudentInfoSystem {
    private IStudent student;
    private ICourse course;

    public StudentInfoSystem(IStudent student, ICourse course) {
        this.student = student;
        this.course = course;
    }

    public void enroll() {
        Enrollment.enrollStudentInCourse(student, course);
    }
}
