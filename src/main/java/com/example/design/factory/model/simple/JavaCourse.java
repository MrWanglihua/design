package com.example.design.factory.model.simple;

public class JavaCourse implements Course{
    @Override
    public void record() {
        System.out.println("This is a Java Course");
    }
}
