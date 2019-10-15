package com.sample.patterns.command;

public class ChangeRadioStationCommand implements ICommand {
    private final Car receiver;

    public ChangeRadioStationCommand(Car receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.changeRadioStation();
    }
}
