package com.example.design.proxy.dynamicProxy.jdkProxy;

import com.example.design.proxy.Person;

public class GPTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person)new GPMeipo().getInstance(new Customer());
            System.out.println(obj.getClass());
            obj.findLover();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
