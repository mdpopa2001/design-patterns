package com.sample.patterns.abstractfactory;

public class ConfigurationProductCreator extends ProductCreator {
    private final String configuratedValue;

    public ConfigurationProductCreator(String configuratedValue) {
        this.configuratedValue = configuratedValue;
    }

    @Override
    public IProduct createProduct() {
        if( "SW".equals(configuratedValue))
            return new SoftwareProduct();

        if( "HW".equals(configuratedValue))
            return new HardwareProduct();

        throw new IllegalArgumentException("Allowed params SW/HW");
    }
}
