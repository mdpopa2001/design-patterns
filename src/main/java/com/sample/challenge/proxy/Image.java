package com.sample.challenge.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Image implements Graphic {
    private static final Logger logger = LoggerFactory.getLogger(Image.class);
    private byte[] data;

    public Image(String filename) {
        // Load the image
        data = loadImage(filename);
    }

    public void draw() {
        // Draw the image
        drawToScreen(data);
    }

    private byte[] loadImage(String fileName)
    {
        logger.info("Loading big image...");
        try {
            Thread.sleep((int) (10000 * Math.random()));
        } catch (InterruptedException e) {
        }

        logger.info("End loading the big image...");

        return new byte[1000];
    }

    private void drawToScreen(byte[] data)
    {
        logger.info("Drawing big image...");
    }

}