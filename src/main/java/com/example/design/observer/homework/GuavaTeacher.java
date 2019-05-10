package com.example.design.observer.homework;

import com.example.design.observer.v1.GPer;
import com.example.design.observer.v1.Question;
import com.google.common.eventbus.Subscribe;

import java.util.Observable;

public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }
    @Subscribe
    public void update(Object obj) {
        Question question = (Question) obj;
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + question.getPlatformName()+ "”的提问，希望您解答，问题内容如下：\n" +
                question.getContent() + "\n" + "提问者：" + question.getUserName());
    }
}
