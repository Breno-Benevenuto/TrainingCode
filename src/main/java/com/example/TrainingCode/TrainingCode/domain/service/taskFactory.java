package com.example.TrainingCode.TrainingCode.domain.service;

import com.example.TrainingCode.TrainingCode.domain.enums.taskEnum;
import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;
import com.example.TrainingCode.TrainingCode.tasks.condicional;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class taskFactory {

    public static taskInterface CreateTask(String taskName){
        Map<Boolean, taskInterface> create = new HashMap<>();

        create.put(taskEnum.CONDICIONAL.getName().equalsIgnoreCase(taskName), new condicional());

        return create.get(true);
    }
}
