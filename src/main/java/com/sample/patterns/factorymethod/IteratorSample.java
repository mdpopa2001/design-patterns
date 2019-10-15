package com.sample.patterns.factorymethod;

import java.util.*;

public class IteratorSample {

    public void demo()
    {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        print(list);
    }

    public <T> void print(Iterable<T> iterable)
    {
        Iterator<T> iterator = iterable.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
