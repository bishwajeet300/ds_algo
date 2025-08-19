package com.bishwajeet.dataStructures.problems.array;

import com.bishwajeet.algorithms.sort.SelectionSort;

import java.util.ArrayList;
import java.util.List;

//Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

public class MissingNumberList {
    private int[] numbers;

    public MissingNumberList(int[] numbers) {
        this.numbers = numbers;
    }

    public List<Integer> missingNumbers() {
        List<Integer> missingList = new ArrayList<>();
        numbers = new SelectionSort(numbers).sort();

        for (int counter = 0; counter < numbers.length; counter++) {
            if ((counter + 1) != numbers[counter] && !missingList.contains(counter + 1)) {
                missingList.add(counter + 1);
            }
            if (missingList.contains(counter + 1)) {
                missingList.remove((Integer)(counter + 1));
            }
        }
        return missingList;
    }
}
