package com.sample.patterns.singleton;

public class LazyLoadSynchronizedMethodSingleton {
    private static LazyLoadSynchronizedMethodSingleton instance = null;

    private LazyLoadSynchronizedMethodSingleton(){}

    public static synchronized LazyLoadSynchronizedMethodSingleton getInstance(){
        if(instance == null){
            instance = new LazyLoadSynchronizedMethodSingleton();
        }
        return instance;
    }

}
