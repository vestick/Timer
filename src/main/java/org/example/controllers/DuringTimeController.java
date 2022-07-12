package org.example.controllers;

import org.example.models.DuringTimeModel;
import org.example.utils.AppStarter;
import org.example.views.DuringTimeView;

public class DuringTimeController {
    DuringTimeView view;
    DuringTimeModel model;

    public DuringTimeController(DuringTimeModel model, DuringTimeView view) {
        this.view = view;
        this.model = model;
    }

    public void setDuringTime(){
        model.setDuringTime(view.doInputDuringTime());
        AppStarter.start();
    }
}
