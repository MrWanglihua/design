package com.example.design.proxy.staticProxy;

import com.example.design.proxy.Person;

public class TestProxy {
    public static void main(String[] args) {
        Person person = new Father(new Son());
        person.findLover();
    }
}
