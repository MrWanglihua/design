package com.example.design.factory.newYear.homework;

public class TAliPay implements AliPay{
    @Override
    public void pay() {
        System.out.println("使用境内支付宝支付");
    }
}
