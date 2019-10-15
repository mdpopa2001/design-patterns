package com.sample.patterns.bridge;

public class RegularBrakeSystem extends  BrakeSystem{
    @Override
    public void start() {
        System.out.println("start regular break system!");
    }

    @Override
    public void activateBrakes(int intensity) {
        System.out.format("Break slowly...%d %n", intensity );
    }

    @Override
    public void stop() {
        System.out.println("stop regular break system");
    }
}
