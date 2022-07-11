package org.example.controllers;

import org.example.models.AppModel;
import org.example.views.AppView;

public class AppController {
    AppModel appModel;
    AppView appView;

    public AppController(AppModel appModel, AppView appView) {
        this.appModel = appModel;
        this.appView = appView;
    }

    public void runApp(){

    }
}
