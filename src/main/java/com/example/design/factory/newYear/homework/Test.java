package com.example.design.factory.newYear.homework;

public class Test {


    public static void main(String[] args) {
        Pay pay = new TerritoryPay();
        AliPay aliPay = pay.aliPay();
        aliPay.pay();
    }
}
