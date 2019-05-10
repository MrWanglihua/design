package com.example.design.decorator.v1;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg{
@Override
protected String getMsg() {
return super.getMsg() + "+1 根香肠";
}
@Override
//加一个香肠加 2 块钱
public int getPrice() {
return super.getPrice() + 2;
}
}