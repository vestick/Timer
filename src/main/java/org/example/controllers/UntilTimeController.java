package org.example.controllers;

import org.example.models.UntilTimeModel;
import org.example.utils.AppStarter;
import org.example.views.UntilTimeView;

public class UntilTimeController {

    UntilTimeModel model;

    UntilTimeView view;

    public UntilTimeController(UntilTimeModel model, UntilTimeView view) {
        this.model = model;
        this.view = view;
    }

    public void setUntilTime(){
        model.setUntilTime(view.doInputUntilTime());
        AppStarter.start();
    }
}
