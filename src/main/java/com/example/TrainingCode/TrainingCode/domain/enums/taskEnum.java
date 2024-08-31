package com.example.TrainingCode.TrainingCode.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum taskEnum {
    CONDICIONAL(1, "Java If-Else"),
    STRING_FORMAT(2, "Java Stdin and Stdout_II"),
    STRING_FORMAT_2(3, "Java Output Formatting"),
    Merge_Two_Sorted_Lists(4, "Merge Two Sorted Lists");

    private final int id;
    private final String name;
}
