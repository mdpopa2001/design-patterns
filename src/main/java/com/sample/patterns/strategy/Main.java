package com.sample.patterns.strategy;

public class Main {

    public static void main(String[] args)
    {
        Article regularArticle = new Article(new NoDiscountStrategy());
        System.out.format("Regular price...%f %n", regularArticle.getPrice() );
        Article onSaleArticle5 = new Article(new LogisticFunctionStrategy(5));
        System.out.format("On sales with 5 year bonus card...%f %n", onSaleArticle5.getPrice() );

        Article onSaleArticle1 = new Article(new LogisticFunctionStrategy(1));
        System.out.format("On sales with 1 year bonus card...%f %n", onSaleArticle1.getPrice() );
    }
}
