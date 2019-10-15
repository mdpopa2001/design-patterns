package com.sample.patterns.decorator;

public abstract class FancyFeatureDecorator implements ICar{
    protected final ICar car;
    public FancyFeatureDecorator(ICar car) {
        this.car = car;
    }

    @Override
    public void start() {
        car.start();
    }

    @Override
    public void stop() {
        car.stop();
    }
}
