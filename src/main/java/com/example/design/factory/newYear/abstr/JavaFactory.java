package com.example.design.factory.newYear.abstr;

public class JavaFactory extends CourseFactory{

    @Override
    public Video createVideo() {
        return new JavaVideo();
    }

    @Override
    public Note createNote() {
        return new JavaNode();
    }

}
