package com.sample.challenge.command;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Invoker implements Runnable {

    private final Queue<Command> queue = new  ConcurrentLinkedQueue<Command>();
    private volatile boolean stopped = false;
    public void enqueue(Command command)
    {
        this.queue.add(command);
    }

    public void stop()
    {
        this.stopped = true;
    }

    public void run()
    {
        while(!this.queue.isEmpty() || !stopped)
        {
            Command cmd = this.queue.poll();
            if(cmd != null)
                cmd.execute();

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }


}
