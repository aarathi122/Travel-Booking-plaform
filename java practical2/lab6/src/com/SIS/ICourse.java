package com.SIS;

import java.util.List;

public interface ICourse {
    String getCourseName();

    int getCourseID();

    List<IStudent> getEnrolledStudents();

    void enrollStudent(IStudent student);
}
