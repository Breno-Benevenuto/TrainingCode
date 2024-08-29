package com.example.TrainingCode.TrainingCode.tasks;

import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;

import java.util.Scanner;

public class stringFormat implements taskInterface {
    @Override
    public void Run() {
        int i = scanner.nextInt();
        double d = scanner.nextDouble();
        scanner.nextLine();
        String s = scanner.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
