package com.example.TrainingCode.TrainingCode.tasks;


import com.example.TrainingCode.TrainingCode.domain.interfaces.taskInterface;

import java.util.Arrays;

public class searchInsertPosition implements taskInterface {


    @Override
    public void Run() {
        int[] nums = {1,3,5,6};
        System.out.print(searchInsert(nums, 5));
    }

    public int searchInsert(int[] nums, int target) {
        return searchBB(nums, nums,target);
    }

    private int searchIndex(int[] originalNums, int[] nums,int target){
        for (int i = 0; i < originalNums.length; i++) {
            if (originalNums[i] == nums[0]) {
                if(originalNums[i] >= target){
                    return i;
                }return i + 1;
            }
        }return 0;
    }
    public int searchBB(int[] originalNums, int[] nums,int target){
        var pivo = (int) Math.floor((double)nums.length / 2);

        if(nums[pivo] == target){
            var onlyNumber = new int[1];
            onlyNumber[0] = nums[pivo];
            return searchIndex(originalNums, onlyNumber ,target);
        }
        if(nums.length == 1){
            return searchIndex(originalNums, nums ,target);
        }

        if(nums[pivo] < target){
            var diff= nums.length - pivo;
            int[] newArray = new int[diff];
            for (int i = 0; i < diff; i++){
                newArray[i] = nums[pivo + i];
            }
            return searchBB(originalNums,newArray, target);
        }else{
            var diff = pivo - 1;
            int[] newArray = new int[pivo];
            for (int i = diff; i >= 0; i--){
                pivo--;
                newArray[i] = nums[pivo];
            }
            return searchBB(originalNums,newArray, target);
        }

    }
}
