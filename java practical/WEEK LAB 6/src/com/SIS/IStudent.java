package com.SIS;

import java.util.List;

public interface IStudent {
    String getName();

    int getID();

    List<ICourse> getEnrolledCourses();

    void enrollInCourse(ICourse course);
}
