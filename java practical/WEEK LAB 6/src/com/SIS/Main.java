package com.SIS;

public class Main {
    public static void main(String[] args) {
        IStudent student1 = new Student("John Doe", 101);
        ICourse course1 = new Course("Mathematics", 501);

        StudentInfoSystem sis = new StudentInfoSystem(student1, course1);
        sis.enroll();
    }
}
