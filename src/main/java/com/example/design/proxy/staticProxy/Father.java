package com.example.design.proxy.staticProxy;

import com.example.design.proxy.Person;

public class Father implements Person {

    private  Person person;

    public Father(Person person) {
        this.person = person;
    }

    @Override
    public void findLover() {
        System.out.println("开始物色对象！");
        person.findLover();
        System.out.println("合适，就处吧！");
    }
}
