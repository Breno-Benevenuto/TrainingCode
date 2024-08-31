package com.example.TrainingCode.TrainingCode.domain.service;

import com.example.TrainingCode.TrainingCode.domain.enums.taskEnum;
import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;
import com.example.TrainingCode.TrainingCode.tasks.searchInsertPosition;
import com.example.TrainingCode.TrainingCode.tasks.mergeTwoSortedLists;
import com.example.TrainingCode.TrainingCode.tasks.condicional;
import com.example.TrainingCode.TrainingCode.tasks.stringFormat;
import com.example.TrainingCode.TrainingCode.tasks.stringFormat2;

import java.util.HashMap;
import java.util.Map;

public class taskFactory {

    public static taskInterface CreateTask(String taskName){
        Map<Boolean, taskInterface> create = new HashMap<>();

        create.put(taskEnum.CONDICIONAL.getName().equalsIgnoreCase(taskName), new condicional());
        create.put(taskEnum.STRING_FORMAT.getName().equalsIgnoreCase(taskName), new stringFormat());
        create.put(taskEnum.STRING_FORMAT_2.getName().equalsIgnoreCase(taskName), new stringFormat2());
        create.put(taskEnum.Merge_Two_Sorted_Lists.getName().equalsIgnoreCase(taskName), new mergeTwoSortedLists());
        create.put(taskEnum.Search_Insert_Position.getName().equalsIgnoreCase(taskName), new searchInsertPosition());

        return create.get(true);
    }
}
