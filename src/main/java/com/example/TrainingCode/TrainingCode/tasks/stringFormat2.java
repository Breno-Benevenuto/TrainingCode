package com.example.TrainingCode.TrainingCode.tasks;

import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;

public class stringFormat2 implements taskInterface {
    @Override
    public void Run() {
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1 =scanner.next();
            System.out.printf("%-15s", s1);
            int x=scanner.nextInt();
            System.out.printf("%03d", x);
            System.out.println();
            //Complete this line
        }
        System.out.println("================================");
    }
}
