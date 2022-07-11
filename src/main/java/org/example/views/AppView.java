package org.example.views;

import java.util.Scanner;

public class AppView {
    Scanner scanner;

    public int inputChoice() {
        System.out.println("\n______ MENU _________\n1 - Set a timer until the specified time\n2 - Set a timer for the specified time \n0 - Close the App. ");
        return scanner.nextInt();
    }


}
