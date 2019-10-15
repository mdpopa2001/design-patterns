package com.sample.patterns.factorymethod.impl;

import com.sample.patterns.factorymethod.Car;
import com.sample.patterns.factorymethod.Engine;

public class RaceCar extends Car {
    @Override
    protected Engine newEngine() {
        return new V12Engine();
    }
}
