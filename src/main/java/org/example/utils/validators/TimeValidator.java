package org.example.utils.validators;

import org.example.utils.exceptions.TimeFormatException;

public class TimeValidator {
    public static void validate(String time) {
        if (time.length() != 4 || !checkMiddleChar(time) || !checkLimitTime(time)) {
            throw new TimeFormatException("Not correct format time");
        }
    }

    private static boolean checkMiddleChar(String time) {
        return String.valueOf(time.charAt(2)).equals(":");
    }

    private static boolean checkLimitTime(String time) {
        return Integer.parseInt(time.substring(0, 1))>23 && Integer.parseInt(time.substring(3, 4))>59;
    }
}
