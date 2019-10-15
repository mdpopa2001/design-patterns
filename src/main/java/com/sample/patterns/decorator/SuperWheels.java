package com.sample.patterns.decorator;

public class SuperWheels extends FancyFeatureDecorator{
    public SuperWheels(ICar car) {
        super(car);
    }

    @Override
    public void start() {
        super.start();
        System.out.println("super wheeels set!!");
    }
}
