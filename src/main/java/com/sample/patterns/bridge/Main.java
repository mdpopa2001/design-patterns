package com.sample.patterns.bridge;


public class Main {
    public static void main(String[] args)
    {
        FamilyCar familySportCar = new FamilyCar(new DynamicBrakeSystem());
        familySportCar.brake();

        FamilyCar regularFamilyCar = new FamilyCar(new RegularBrakeSystem());
        regularFamilyCar.brake();

        SportCar car = new SportCar(new DynamicBrakeSystem());
        car.hardBreak();

    }
}
