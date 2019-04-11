package com.example.design.factory.model.abstr;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaFactory();
        factory.getNode().nodes();
        factory.getVideo().videos();
    }
}
