package com.sample.patterns.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class Example {
    private final static Logger logger = LoggerFactory.getLogger(Example.class);

    public void doAction()
    {
        Collection<Integer> list = Arrays.asList(1,2,3,4);

        //actual it returns a private subclass wrapper Collections.SynchronizedCollection
        Collection<Integer> syncCollection = Collections.synchronizedCollection(list);

        Set syncedSet = Collections.synchronizedSet(new HashSet());

        List<Integer> unmodifiableList = Collections.unmodifiableList(Arrays.asList(1,2,3));


        Map<String, Integer> originalMap = new HashMap<String, Integer>(){{put("ala bala",1);}};
        Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(originalMap);


    }


}
