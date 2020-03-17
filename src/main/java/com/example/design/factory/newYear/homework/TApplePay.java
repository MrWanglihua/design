package com.example.design.factory.newYear.homework;

public class TApplePay implements ApplePay{
    @Override
    public void pay() {
        System.out.println("使用境内apple支付");
    }
}
