package com.example.design.factory.newYear.homework;

public class AbortPay implements Pay{
    @Override
    public AliPay aliPay() {
        return null;
    }

    @Override
    public WeChartPay weChartPay() {
        return null;
    }

    @Override
    public UnionPay unionPay() {
        return null;
    }

    @Override
    public ApplePay applePay() {
        return null;
    }
}
