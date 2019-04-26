package com.example.design.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionFactory {


    private static final Map<String,PromotionStrategy> PROMOTION_STRATEGY_MAP =
            new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK,new CashBackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.EMPTY,new EmptyStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON,new CouponStrategy());
    }
    public PromotionFactory() {
    }

    public static PromotionStrategy getPromotionInstance(String key){
        PromotionStrategy strategy = PROMOTION_STRATEGY_MAP.get(key);

        return strategy==null?new EmptyStrategy():strategy;
    }

    private interface PromotionKey{
        public static final String COUPON = "COUPON";
        public static final String EMPTY = "EMPTY";
        public static final String CASHBACK = "CASHBACK";
    }

}
