package com.sample.challenge.staticfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Color {
    private static final Logger logger = LoggerFactory.getLogger(Color.class);
    private final int red;
    private final int green;
    private final int blue;
    private Color(int red, int green, int blue)
    {
        logger.info("Creating a new color!"  );
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    /*
     * Implement the static factory method
     */



    /*
     * Implement a caching mechanism!!
     */

}
