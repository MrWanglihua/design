package com.example.design.proxy.dynamicProxy.jdkProxy;

import com.example.design.proxy.Person;

public class Customer implements Person {
    @Override
    public void findLover() {
        System.out.println("肤白貌美大长腿");
    }
}
