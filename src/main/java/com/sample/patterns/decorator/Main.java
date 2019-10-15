package com.sample.patterns.decorator;

public class Main {
    public static void main(String[] args)
    {
        ICar fancySport = new SuperEngine(
                            new SuperWheels(
                                    new SportCar()
                            )
                         );
        fancySport.start();
    }
}
