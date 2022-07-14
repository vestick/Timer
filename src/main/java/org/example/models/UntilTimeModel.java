package org.example.models;

import org.example.utils.AppStarter;
import org.example.utils.Sound;
import org.example.utils.exceptions.TimeFormatException;
import org.example.utils.validators.TimeValidator;
import org.example.views.UntilTimeView;

import java.time.LocalDateTime;

public class UntilTimeModel {

    UntilTimeView view;

    public UntilTimeModel(UntilTimeView view) {
        this.view = view;
    }

    public void setUntilTime(String untilTime) {
        try {
            view.getOutput("The wait will take " + (getUntilMinutes(untilTime) - getNowMinutes()) + " minutes...");
        } catch (NumberFormatException e) {
            System.out.println("Symbols cannot be present in time");
            AppStarter.start();
        }
        try {
            Thread.sleep((getUntilMinutes(untilTime) - getNowMinutes()) * 60000L);

        } catch (IllegalArgumentException ex) {
            System.out.println("You must enter a time later than the present");
            AppStarter.start();

        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        Sound.playSound("src/main/resources/sounds/tickTock.wav").join();
    }

    private int getUntilMinutes(String untilTime) {
        try {
            TimeValidator.validateUntilTime(untilTime);
        } catch (TimeFormatException e) {
            System.out.println(e.getMessage());
            AppStarter.start();
        }
        return (Integer.parseInt(untilTime.substring(0, 2)) * 60) + (Integer.parseInt(untilTime.substring(3, 5)));
    }

    private int getNowMinutes() {
        return LocalDateTime.now().getMinute() + LocalDateTime.now().getHour() * 60;
    }
}
