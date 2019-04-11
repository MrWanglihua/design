package com.example.design.factory.model.factory;

import com.example.design.factory.model.simple.Course;
import com.example.design.factory.model.simple.PythonCourse;

public class PythonFactory implements CourseFactory{
    @Override
    public Course getCourse() {
        return new PythonCourse();
    }
}
