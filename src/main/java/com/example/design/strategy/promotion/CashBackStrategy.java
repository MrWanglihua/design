package com.example.design.strategy.promotion;

public class CashBackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("直接返现！！！");
    }
}
