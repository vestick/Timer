package org.example.models;

import org.example.utils.AppStarter;
import org.example.utils.Sound;
import org.example.views.UntilTimeView;

import java.time.LocalDateTime;

public class UntilTimeModel {

    UntilTimeView view;

    public UntilTimeModel(UntilTimeView view) {
        this.view = view;
    }

    public void setUntilTime(String untilTime) {
        view.getOutput("The wait will take " + (getUntilMinutes(untilTime) - getNowMinutes()) + " minutes...");
        try {
            Thread.sleep((getUntilMinutes(untilTime) - getNowMinutes()) * 60000L);
            //TODO Add crash reporter txt

        } catch (IllegalArgumentException ex) {
            System.out.println("You must enter a time later than the present");
            AppStarter.start();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Sound.playSound("src/main/resources/sounds/tickTock.wav").join();
    }

    private int getUntilMinutes(String untilTime) {
        return (Integer.parseInt(untilTime.substring(0, 2)) * 60) + (Integer.parseInt(untilTime.substring(3, 5)));
    }

    private int getNowMinutes() {
        return LocalDateTime.now().getMinute() + LocalDateTime.now().getHour() * 60;
    }
}
