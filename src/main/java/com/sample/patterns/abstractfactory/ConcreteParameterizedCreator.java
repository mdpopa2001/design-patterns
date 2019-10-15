package com.sample.patterns.abstractfactory;

public class ConcreteParameterizedCreator extends ParameterizedCreator {
    @Override
    public IProduct createProduct(String productId) {
        if( "SW".equals(productId))
            return new SoftwareProduct();

        if( "HW".equals(productId))
            return new HardwareProduct();

        throw new IllegalArgumentException("Allowed params SW/HW");
    }
}
