package com.sample.challenge.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FinancialDocument {
    private static final Logger logger = LoggerFactory.getLogger(FinancialDocument.class);
    private final String id ;

    public FinancialDocument(String id) {
        this.id = id;
    }

    public void generateReport()
    {
        logger.info("Generating the report for document " + id);
        try {
            Thread.sleep((int)(2000 * Math.random()));
        } catch (InterruptedException e) {
        }
    }

    public void sendEmail()
    {
        logger.info("Send by email document " + id);
        try {
            Thread.sleep((int)(2000 * Math.random()));
        } catch (InterruptedException e) {
        }
    }

    public void cancel()
    {
        logger.info("Canceling the  document " + id);
        try {
            Thread.sleep((int)(2000 * Math.random()));
        } catch (InterruptedException e) {
        }
    }

}
