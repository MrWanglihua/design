package com.example.design.strategy.promotion;

public class PromotionActive {

        private PromotionStrategy strategy;

    public PromotionActive(PromotionStrategy strategy) {
        this.strategy = strategy;
    }
    public void doActive(){
        this.strategy.doPromotion();
    }
}
