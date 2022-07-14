package org.example.controllers;

import org.example.models.AppModel;
import org.example.utils.Constants;
import org.example.utils.validators.ChoiceValidator;
import org.example.views.AppView;

public class AppController {
    AppModel model;
    AppView view;

    public AppController(AppModel model, AppView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {
        selectChoice(ChoiceValidator.validate(view.inputChoice()));
    }

    private void selectChoice(int choice) {
        switch (choice) {
            case 1: {
                model.setUntilTime();
            }
            case 2: {
                model.setDuringTime();
            }
            case 0: {
                String output = Constants.EXIT_MESSAGE;
                view.getOutput(output);
            }
        }
    }
}
