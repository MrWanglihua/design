package com.example.design.delegate.simple;

public class DelegateTest {
    public static void main(String[] args) {
        new Boss().doing("架构",new Leader());
    }
}
