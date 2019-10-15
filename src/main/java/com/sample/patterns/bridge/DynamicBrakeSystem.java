package com.sample.patterns.bridge;

public class DynamicBrakeSystem extends BrakeSystem {
    @Override
    public void start() {
        System.out.println("start dynamic break system!");
    }

    @Override
    public void activateBrakes(int intensity) {
        System.out.format("dynamic breakiiiing! %d %n", intensity);
    }

    @Override
    public void stop() {
        System.out.println("start dynamic break system!");
    }
}
