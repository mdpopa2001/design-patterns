package com.sample.patterns.factorymethod;

public abstract class Car {

    protected abstract Engine newEngine();
    public void start()
    {
        Engine engine = newEngine();
        engine.start();
    }
}
