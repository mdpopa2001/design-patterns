package com.sample.patterns.adapter;

/*
 * Object adapter for the MultimediaComponent(CarRadio & CarTV...)
 */
public class MultimediaObjectAdapter implements CarComponent{
    private final MultimediaComponent adaptee;

    public MultimediaObjectAdapter(MultimediaComponent multimediaComponent) {
        this.adaptee = multimediaComponent;
    }

    @Override
    public void start() {
        //start the radio
        adaptee.on();
    }

    @Override
    public void stop() {
        //stop the radio
        adaptee.off();
    }
}


