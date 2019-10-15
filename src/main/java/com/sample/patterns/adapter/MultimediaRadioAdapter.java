package com.sample.patterns.adapter;

/*
 * Class adapter for the CarRadio
 */
public class MultimediaRadioAdapter extends CarRadio implements CarComponent{
    @Override
    public void start() {
        //start the radio
        this.on();
    }

    @Override
    public void stop() {
        //stop the radio
        this.off();
    }

    /*
     * We override the behaviour of the component that we are adapting
     */
    @Override
    public void on() {
        System.out.println("Radio is starting...!");
    }
}


