package com.sample.patterns.bridge;

public class SportCar extends Car{
    public SportCar(BrakeSystem brakeSystem) {
        super(brakeSystem);
    }

    public void hardBreak(){
        this.brakeSystem.activateBrakes(100);
    }
}
