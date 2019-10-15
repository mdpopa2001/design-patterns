package com.sample.patterns.chain_of_responsability;

public class ConsoleLogger extends Logger {
    @Override
    protected void logInternal(String message) {
        System.out.printf("Logging to console %s!!%n",message );
    }
}
