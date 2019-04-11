package com.example.design.factory.model.simple;

public class PythonCourse implements Course{
    @Override
    public void record() {
        System.out.println("This is a Python course");
    }
}
