package com.sample.patterns.abstractfactory;

public class HwProductCreator extends ProductCreator {
    @Override
    public IProduct createProduct() {
        return new HardwareProduct();
    }
}
