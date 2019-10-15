package com.sample.patterns.adapter;

public abstract class MultimediaComponent {
    public abstract void on();
    public abstract void off();
}

class CarRadio extends MultimediaComponent {
    public void on() {
        System.out.println("Starting to play music!");
    }

    public void off(){
        System.out.println("Stoping your favourite music!");
    }
}

class CarTV extends MultimediaComponent {
    public void on() {
        System.out.println("Starting the TV!");
    }

    public void off(){
        System.out.println("Stoping the TV!");
    }
}

