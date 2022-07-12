package org.example.views;

import java.util.Scanner;

public class AppView implements Printable<String>{
    Scanner scanner = new Scanner(System.in);

    public int inputChoice() {
        System.out.println("\n______ MENU ______\n1 - Set a timer until the specified time\n2 - Set a timer during the specified time \n0 - Close the App. ");
        return scanner.nextInt();
    }
}
