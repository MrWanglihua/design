package com.example.design.test;

public class TestProxxy {

    public static void main(String[] args) {
        Person instance = (Person) new JDKProxy().getInstance(new Custom());
        instance.findLover();
    }
}
