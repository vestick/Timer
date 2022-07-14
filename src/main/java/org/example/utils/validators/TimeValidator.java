package org.example.utils.validators;

import org.example.utils.exceptions.TimeFormatException;

public class TimeValidator {
    public static void validateUntilTime(String time) {
        if (time.length() != 5 || !checkMiddleChar(time) || !checkLimitTime(time)) {
            throw new TimeFormatException("Not correct format time");
        }
    }

    public static void validateDuringTime(String time) {
        if (time.length() != 5 || !checkMiddleChar(time)) {
            throw new TimeFormatException("Not correct format time");
        }
    }

    private static boolean checkMiddleChar(String time) {
        return String.valueOf(time.charAt(2)).equals(":");
    }

    private static boolean checkLimitTime(String time) {
        return Integer.parseInt(time.substring(0, 1))<24 || Integer.parseInt(time.substring(3, 4))<60;
    }
}
