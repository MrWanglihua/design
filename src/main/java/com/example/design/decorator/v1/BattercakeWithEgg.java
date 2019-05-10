package com.example.design.decorator.v1;

public class BattercakeWithEgg extends Battercake{
@Override
protected String getMsg() {
    return super.getMsg() + "+1 个鸡蛋";
}
    @Override
//加一个鸡蛋加 1 块钱
    public int getPrice() {
        return super.getPrice() + 1;
    }
}