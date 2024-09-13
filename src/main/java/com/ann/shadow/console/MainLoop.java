package com.ann.shadow.console;

import com.ann.shadow.activity.Activity;
import com.ann.shadow.activity.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;


public class MainLoop {
    private final ActivityService activityService;
    public MainLoop(ActivityService activityService) {
        this.activityService = activityService;
    }

    public void startMainLoop() {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != -1) {
            System.out.println("Choose your option");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    String name = sc.nextLine();
                    Activity activity = new Activity(name);
                    activityService.newActivity(activity);
                    break;
            }
        }
    }
}
