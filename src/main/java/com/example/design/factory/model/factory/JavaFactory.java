package com.example.design.factory.model.factory;

import com.example.design.factory.model.simple.Course;
import com.example.design.factory.model.simple.JavaCourse;

public class JavaFactory implements CourseFactory {
    @Override
    public Course getCourse() {
        return new JavaCourse();
    }
}
