package com.example.design.factory.newYear.homework;

public class TWechartPay implements WeChartPay{
    @Override
    public void pay() {
        System.out.println("使用境内微信支付！");
    }
}
