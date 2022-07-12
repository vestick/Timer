package org.example.utils.validators;

import org.example.utils.AppStarter;
import org.example.utils.exceptions.ChoiceException;

public class ChoiceValidator {

    public static int validate(int choice) {
        try {
            if (choice < 0 || choice > 3) {
                throw new ChoiceException("Choose correct option");
            }
        } catch (ChoiceException e) {
            System.out.println(e.getMessage());
            AppStarter.start();
        }
        return choice;
    }
}
