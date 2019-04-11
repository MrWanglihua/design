package com.example.design.factory.model.factory;

import com.example.design.factory.model.simple.Course;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaFactory();
        Course course = factory.getCourse();
        course.record();
    }
}
