package com.sample.patterns.chain_of_responsability;

public abstract class Logger {
    private Logger nextLogger;

    public Logger setSuccesor(Logger logger)
    {
        Logger lastLogger = this;
        while(lastLogger.nextLogger != null)
        {
            lastLogger = lastLogger.nextLogger;
        }
        lastLogger.nextLogger = logger;
        return this;
    }

    protected abstract void logInternal(String message);

    public void log(String message)
    {
        this.logInternal(message);
        if(nextLogger != null)
            nextLogger.log(message);

    }
}
