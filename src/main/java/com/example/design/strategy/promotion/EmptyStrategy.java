package com.example.design.strategy.promotion;

public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("没有优惠！！！");
    }
}
