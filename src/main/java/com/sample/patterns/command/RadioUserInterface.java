package com.sample.patterns.command;

import java.util.ArrayList;
import java.util.List;

public class RadioUserInterface {
    private final List<ICommand> history = new ArrayList<>();
    private final ICommand startRadio;
    private final ICommand stopRadio;
    private final ICommand changeRadio;
    public RadioUserInterface(Car car)
    {
        startRadio = new StartRadioCommand(car);
        stopRadio = new StopRadioCommand(car);
        changeRadio = new ChangeRadioStationCommand(car);
    }

    public void startRadio()
    {
        this.startRadio.execute();
        this.history.add(startRadio);
    }

    public void stopRadio()
    {
        this.stopRadio.execute();
        this.history.add(stopRadio);
    }

    public void changeRadio()
    {
        this.changeRadio.execute();
        this.history.add(changeRadio);
    }

}

