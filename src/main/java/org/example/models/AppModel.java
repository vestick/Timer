package org.example.models;

import org.example.controllers.DuringTimeController;
import org.example.controllers.UntilTimeController;
import org.example.views.DuringTimeView;
import org.example.views.UntilTimeView;

public class AppModel {

    public void setUntilTime() {
        UntilTimeView view = new UntilTimeView();
        UntilTimeModel model = new UntilTimeModel(view);
        UntilTimeController controller = new UntilTimeController(model, view);
        controller.setUntilTime();
    }

    public void setDuringTime() {
        DuringTimeView view = new DuringTimeView();
        DuringTimeModel model = new DuringTimeModel(view);
        DuringTimeController controller = new DuringTimeController(model, view);
        controller.setDuringTime();
    }

}
