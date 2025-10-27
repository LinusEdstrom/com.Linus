package com.Linus.pricing;

public class Premium implements PricePolicy{

    @Override
    public int calculatePrice(int price) {
        int premiumPrice = price * 0.8;
        return premiumPrice;
    }
}
