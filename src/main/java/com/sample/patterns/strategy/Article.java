package com.sample.patterns.strategy;

public class Article {
    private final IDiscountStrategy priceStrategy;

    public Article(IDiscountStrategy priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    public double getPrice()
    {
        return 1000 * (1-priceStrategy.getDiscount());
    }
}
