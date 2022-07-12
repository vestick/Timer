package org.example.models;

import org.example.utils.Sound;
import org.example.views.DuringTimeView;

public class DuringTimeModel {
    DuringTimeView view;

    public DuringTimeModel(DuringTimeView view) {
        this.view = view;
    }

    public void setDuringTime(String untilTime) {
        view.getOutput("The wait will take " + getDuringMinutes(untilTime) + " minutes...");
        try {
            Thread.sleep(getDuringMinutes(untilTime) * 60000L);
            //TODO Add crash reporter txt

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Sound.playSound("src/main/resources/sounds/tickTock.wav").join();
    }

    private int getDuringMinutes(String duringTime) {
        return (Integer.parseInt(duringTime.substring(0, 2)) * 60) + (Integer.parseInt(duringTime.substring(3, 5)));
    }
}
