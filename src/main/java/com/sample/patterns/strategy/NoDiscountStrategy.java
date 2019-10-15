package com.sample.patterns.strategy;

public class NoDiscountStrategy implements IDiscountStrategy {

    @Override
    public double getDiscount() {
        return 0;
    }
}
