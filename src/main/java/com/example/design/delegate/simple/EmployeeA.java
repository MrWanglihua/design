package com.example.design.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我在工作，我擅长加密"+command);
    }
}
