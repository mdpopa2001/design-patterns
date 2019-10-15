package com.sample.patterns.factorymethod;

import com.sample.patterns.factorymethod.impl.FamilyCar;
import com.sample.patterns.factorymethod.impl.RaceCar;

public class Main {
    public static void main(String[] args)
    {
        Car familyCar = new FamilyCar();
        familyCar.start();

        Car raceCar = new RaceCar();
        raceCar.start();

    }
}
