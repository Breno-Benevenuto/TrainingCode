package com.example.TrainingCode.TrainingCode.tasks;

import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class condicional implements taskInterface {
    @Override
    public void Run() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        if(!(N % 2 == 0)){
            System.out.println("Weird");
        }else {
            if(N >= 2 && N<=5){
                System.out.println("Not Weird");
            }else if(N >= 6 && N<=20){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }
    }
}

