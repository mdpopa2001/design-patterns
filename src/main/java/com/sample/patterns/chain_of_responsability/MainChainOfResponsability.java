package com.sample.patterns.chain_of_responsability;

public class MainChainOfResponsability {
    public static void main(String [] args)
    {
        Logger logger = new ConsoleLogger()
                    .setSuccesor(new FileLogger())
                    .setSuccesor(new DatabaseLogger());

        logger.log("Hello world!");

    }
}
