package com.sample.patterns.strategy;

public class LogisticFunctionStrategy implements IDiscountStrategy {
    private final double years;
    public LogisticFunctionStrategy(double years) {
        this.years = years;
    }

    @Override
    public double getDiscount() {
        //logistic function where the maximum discount is 30%
        return (30 /(1  + Math.exp(-1 * (this.years  - 2) )))/100;
    }
}
