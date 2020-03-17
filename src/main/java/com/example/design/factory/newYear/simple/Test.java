package com.example.design.factory.newYear.simple;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaCourseFactory();
        Course course = factory.create();
        course.recode();
        System.out.println();

    }
}
