package com.sample.patterns.singleton;

public class SingletonMain {
    public static void main()
    {
        FinalFieldSingleton.instance.getCounter();

        FinalFieldWithGuardMethodSingleton.getInstance().getCounter();

    }
}
