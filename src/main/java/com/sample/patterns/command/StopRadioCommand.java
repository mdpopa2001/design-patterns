package com.sample.patterns.command;

public class StopRadioCommand implements ICommand {
    private final Car receiver;

    public StopRadioCommand(Car receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.stopRadio();
    }
}
