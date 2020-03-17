package com.example.design.factory.newYear.abstr;

public class Test {
    public static void main(String[] args) {
        CourseFactory factory = new JavaFactory();
        Note note = factory.createNote();
        Video video = factory.createVideo();
        factory.init();
        note.node();
        video.video();
    }
}
