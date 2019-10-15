package com.sample.patterns.singleton;

public class LazyLoadSingleton {
    private static LazyLoadSingleton instance = null;
    private final static Object lockObject = new Object();

    private LazyLoadSingleton(){}

    public static LazyLoadSingleton getInstance(){
        if(instance == null){
            synchronized (lockObject){
                if(instance == null){
                    instance = new LazyLoadSingleton();
                }
            }
        }

        return instance;
    }

}
