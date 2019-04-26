package com.example.design.strategy.promotion;

public class PromotionActiveTest {
  /*  public static void main(String[] args) {
        String active = "COUPON";

        PromotionActive promotionActive = null;
        if("COUPON".equals(active)){
            promotionActive = new PromotionActive(new CouponStrategy());
        }else{
            promotionActive = new PromotionActive(new CashBackStrategy());
        }
        promotionActive.doActive();

    }*/
  public static void main(String[] args) {
      PromotionActive active =
              new PromotionActive(PromotionFactory.getPromotionInstance("CASHBACK"));
      active.doActive();
  }
}
