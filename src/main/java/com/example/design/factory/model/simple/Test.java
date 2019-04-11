package com.example.design.factory.model.simple;

public class Test {
    public static void main(String[] args) {
//        简单工厂模式：model1
       /* CourseFactory factory = new CourseFactory();
        Course java = factory.getCourse("java");
        java.record();*/
//       简单工厂模式：model 2
       /* CourseFactory factory = new CourseFactory();
        Course java = factory.getCourse("com.example.design.factory.model.simple.JavaCourse");
        java.record();*/
        CourseFactory factory = new CourseFactory();
        Course java = factory.getCourse(JavaCourse.class);
        java.record();
    }
}
