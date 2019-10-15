package com.sample.patterns.factorymethod.impl;

import com.sample.patterns.factorymethod.Engine;

public class V6Engine implements Engine {
    @Override
    public void start() {
        System.out.println("brrrr!");
    }
}
