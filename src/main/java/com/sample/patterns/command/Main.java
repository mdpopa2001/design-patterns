package com.sample.patterns.command;

public class Main {

    public static void main(String[] args)
    {
        Car car = new Car();
        RadioUserInterface ui = new RadioUserInterface(car);

        ui.startRadio();
        ui.changeRadio();
        ui.stopRadio();

    }
}
