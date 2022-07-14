package org.example.views;

import java.util.Scanner;

public class UntilTimeView implements Printable<String> {

    Scanner scanner = new Scanner(System.in);

    public String doInputUntilTime() {
        System.out.println("Enter the time until which the timer will wait (Like 00:22): ");

        return scanner.nextLine();
    }
}
