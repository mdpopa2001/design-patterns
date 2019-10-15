package com.sample.patterns.abstractfactory;

public class SoftwareProduct implements IProduct {
    @Override
    public String getName() {
        return "Software product";
    }

    @Override
    public void install() {
        System.out.println("Installing SW !");
    }
}
