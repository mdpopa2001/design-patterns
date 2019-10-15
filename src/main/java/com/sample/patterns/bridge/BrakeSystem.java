package com.sample.patterns.bridge;

public abstract class BrakeSystem {
    public abstract void start();
    public abstract void activateBrakes(int intensity);
    public abstract void stop();
}
