package com.sample.patterns.bridge;

public abstract class Car {
    protected final BrakeSystem brakeSystem;

    public Car(BrakeSystem brakeSystem) {
        this.brakeSystem = brakeSystem;
    }

    public void start() {
        brakeSystem.start();
    }

    public void stop(){
        brakeSystem.stop();
    }

    public void brake()
    {
        brakeSystem.activateBrakes(10);
    }

}

