package com.sample.patterns.singleton;

public class FinalFieldSingleton {
    public static final FinalFieldSingleton instance = new FinalFieldSingleton();
    private FinalFieldSingleton()
    {
    }

    private int counter = 0;

    public void incrementCounter()
    {
        counter ++;
    }

    public int getCounter()
    {
        return counter;
    }
}
