package com.example.TrainingCode.TrainingCode.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public enum taskEnum {
    CONDICIONAL(1, "Condicional");

    private final int id;
    private final String name;
}
