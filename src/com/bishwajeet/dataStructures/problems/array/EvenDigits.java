package com.bishwajeet.dataStructures.problems.array;

/*
* Given an array nums of integers, return how many of them contain an even number of digits.
* */
public class EvenDigits {

    public int findNumbers(int[] nums) {
        int evenCount = 0;
        for (int num : nums) {
            if (isEvenCount(num)) {
                evenCount++;
            }
        }
        return evenCount;
    }

    boolean isEvenCount(int num) {
        return (getNumberCount(num) % 2 == 0);
    }

    int getNumberCount(int num) {
        int count = 1;
        while((num / 10) > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
