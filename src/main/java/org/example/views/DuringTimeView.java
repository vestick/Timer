package org.example.views;

import java.util.Scanner;

public class DuringTimeView implements Printable<String>{
    Scanner scanner = new Scanner(System.in);

    public String doInputDuringTime() {
        System.out.println("Enter the time during which the timer will wait: ");
        //TODO time validator

        return scanner.nextLine();
    }
}
