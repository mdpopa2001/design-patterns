package com.sample.patterns.chain_of_responsability;

public class DatabaseLogger extends Logger {
    @Override
    protected void logInternal(String message) {
        System.out.printf("Logging to database %s!!%n",message );
    }
}
