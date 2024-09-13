package com.ann.shadow.console;

import java.util.Scanner;

public class MainLoop {
    public static void startMainLoop() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != -1) {
            System.out.println("Choose your option");
            option = sc.nextInt();
        }
    }
}
