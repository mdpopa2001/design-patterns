package com.sample.patterns.singleton;

public class FinalFieldWithGuardMethodSingleton {
    private static final FinalFieldWithGuardMethodSingleton instance = new FinalFieldWithGuardMethodSingleton();
    private FinalFieldWithGuardMethodSingleton()
    {
    }

    public static FinalFieldWithGuardMethodSingleton getInstance(){
        return instance;
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
