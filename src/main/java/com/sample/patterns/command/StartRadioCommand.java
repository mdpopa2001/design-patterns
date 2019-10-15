package com.sample.patterns.command;

public class StartRadioCommand implements ICommand{
    private final Car receiver;

    public StartRadioCommand(Car receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.startRadio();
    }
}
