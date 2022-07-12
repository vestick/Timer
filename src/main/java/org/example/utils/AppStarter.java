package org.example.utils;

import org.example.controllers.AppController;
import org.example.models.AppModel;
import org.example.views.AppView;

public class AppStarter {
    public static void start(){
        AppModel appModel = new AppModel();
        AppView appView = new AppView();
        AppController controller = new AppController(appModel, appView);
        controller.runApp();
    }
}
