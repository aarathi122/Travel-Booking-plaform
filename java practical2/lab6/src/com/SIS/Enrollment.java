package com.SIS;

public class Enrollment {
    public static void enrollStudentInCourse(IStudent student, ICourse course) {
        student.enrollInCourse(course);
        course.enrollStudent(student);
    }
}
