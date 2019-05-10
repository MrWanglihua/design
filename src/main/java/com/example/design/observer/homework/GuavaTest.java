package com.example.design.observer.homework;

import com.example.design.observer.v1.GPer;
import com.example.design.observer.v1.Question;
import com.example.design.observer.v1.Teacher;
import com.example.design.observer.v3.GuavaEvent;
import com.google.common.eventbus.EventBus;

public class GuavaTest {
    public static void main(String[] args) {
       /* EventBus eventbus = new EventBus();
        GuavaGPer guavaEvent = new GuavaGPer();
        eventbus.register(guavaEvent);

        Question question = new Question();
        question.setUserName("小明");
        question.setTeacherName("Tom");
        question.setContent("观察者模式适用于哪些场景？");
        eventbus.post(question);*/

        GuavaGPer gper = GuavaGPer.getInstance();
//业务逻辑代码
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");
        gper.publishQuestion(question);


    }
}
