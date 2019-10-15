package com.sample.patterns.decorator;

public class SuperEngine extends FancyFeatureDecorator {
    public SuperEngine(ICar car) {
        super(car);
    }

    @Override
    public void start() {
        super.start();
        makeFancyNoise();

    }

    @Override
    public void stop() {
        super.stop();
        makeFancyNoise();
    }

    private void makeFancyNoise()
    {
        System.out.println("Yuppppppppiii!!!");
    }
}
