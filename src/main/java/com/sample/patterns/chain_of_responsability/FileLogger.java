package com.sample.patterns.chain_of_responsability;

public class FileLogger extends Logger {
    @Override
    protected void logInternal(String message) {
        System.out.printf("Logging to file %s!!\n",message );
    }
}
