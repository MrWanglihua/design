package com.example.design.factory.newYear.abstr;

public abstract class CourseFactory {
    public void init(){
        System.out.println("初始化基础数据");
    }

    public abstract Video createVideo();
    public abstract Note createNote();

}
