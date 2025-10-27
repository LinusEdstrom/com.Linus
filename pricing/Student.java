package com.Linus.pricing;

public class Student implements PricePolicy {

    @Override
    public int calculatePrice(int price) {
        int studentPrice = price * 0.9;
        return studentPrice;
    }


}
