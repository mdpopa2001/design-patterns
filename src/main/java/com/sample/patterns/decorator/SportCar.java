package com.sample.patterns.decorator;

public class SportCar implements ICar {
    @Override
    public void start() {
        System.out.println("VRRRRRRRRRRRRUUUMM!!");
    }

    @Override
    public void stop() {
        System.out.println("Stooop");
    }
}
