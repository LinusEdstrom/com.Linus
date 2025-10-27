package com.Linus.pricing;

public class Standard implements PricePolicy {

    @Override
    public int calculatePrice(int price) {
        int standardPrice = price * 1.0;
        return standardPrice;
    }

}
