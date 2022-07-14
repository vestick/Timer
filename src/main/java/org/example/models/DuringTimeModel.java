package org.example.models;

import org.example.utils.AppStarter;
import org.example.utils.Sound;
import org.example.utils.exceptions.TimeFormatException;
import org.example.utils.validators.TimeValidator;
import org.example.views.DuringTimeView;

public class DuringTimeModel {
    DuringTimeView view;

    public DuringTimeModel(DuringTimeView view) {
        this.view = view;
    }

    public void setDuringTime(String duringTime) {
        try {
            view.getOutput("The wait will take " + getDuringMinutes(duringTime) + " minutes...");
        } catch (NumberFormatException e) {
            System.out.println("Symbols cannot be present in time");
            AppStarter.start();
        }

        try {
            Thread.sleep(getDuringMinutes(duringTime) * 60000L);

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Sound.playSound("src/main/resources/sounds/tickTock.wav").join();
    }

    private int getDuringMinutes(String duringTime) {
        try {
            TimeValidator.validateDuringTime(duringTime);
        } catch (TimeFormatException e) {
            System.out.println(e.getMessage());
            AppStarter.start();
        }
        return (Integer.parseInt(duringTime.substring(0, 2)) * 60) + (Integer.parseInt(duringTime.substring(3, 5)));
    }
}
