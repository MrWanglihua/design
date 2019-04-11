package com.example.design.factory.model.abstr;

public class JavaFactory implements CourseFactory{
    @Override
    public Node getNode() {
        return new JavaNode();
    }

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
