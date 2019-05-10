package com.example.design.observer.homework;

import com.example.design.observer.v1.Question;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class GuavaGPer {
    private String name = "GPer 生态圈";

    private static   GuavaGPer guavaGPer;

    private GuavaGPer(){}

    public static GuavaGPer getInstance(){
        if(guavaGPer ==null){
            guavaGPer = new GuavaGPer();
        }
        return guavaGPer;
    }

    public void publishQuestion(Question question) {
        EventBus bus = new EventBus();
        GuavaTeacher teacher = new GuavaTeacher("Tom");
        question.setPlatformName(name);
        bus.register(teacher);
        bus.post(question);
    }
}
