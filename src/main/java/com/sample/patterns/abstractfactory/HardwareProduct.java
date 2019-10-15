package com.sample.patterns.abstractfactory;

public class HardwareProduct implements IProduct {
    @Override
    public String getName() {
        return "Hardware Product";
    }

    @Override
    public void install() {
        System.out.println("Installing HW!");
    }
}
