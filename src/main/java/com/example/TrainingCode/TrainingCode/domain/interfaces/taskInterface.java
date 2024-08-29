package com.example.TrainingCode.TrainingCode.domain.interfaces;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public interface taskInterface {
    Scanner scanner = new Scanner(System.in);

    //Metodo que roda a task
    void Run();
}
