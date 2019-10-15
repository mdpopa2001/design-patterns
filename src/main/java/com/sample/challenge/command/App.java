package com.sample.challenge.command;

import com.sample.challenge.command.commands.CancelCommand;
import com.sample.challenge.command.commands.GenerateReportCommand;
import com.sample.challenge.command.commands.SendEmailCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) throws InterruptedException {

        Invoker invoker = new Invoker();
        Thread thread = new Thread(invoker);
        thread.start();

/*
        for(int i = 0 ; i < 10; i++)
        {
            FinancialDocument document = new FinancialDocument(UUID.randomUUID().toString());
            int type =  ((int)(Math.random() *10)) % 3;
            Command command = type == 0? new GenerateReportCommand(document) :
                                (type == 1) ? new SendEmailCommand(document) :
                                                new CancelCommand(document);
            invoker.enqueue(command);
            Thread.sleep((int)(100* Math.random() ));
        }
*/

        logger.info("Finished sending the work!");
        invoker.stop();

       // thread.join();
    }
}
