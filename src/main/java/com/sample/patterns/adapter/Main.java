package com.sample.patterns.adapter;

public class Main {
    public static void main(String args[])
    {
        CarComponent component = new MultimediaRadioAdapter();
        component.start();

        CarComponent component1 = new MultimediaObjectAdapter(new CarTV());
        component1.start();
    }
}
