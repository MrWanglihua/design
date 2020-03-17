package com.example.design.factory.newYear.homework;

public class TerritoryPay implements Pay {
    @Override
    public AliPay aliPay() {
        return new TAliPay();
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
