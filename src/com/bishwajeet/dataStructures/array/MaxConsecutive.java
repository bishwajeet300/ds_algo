package com.bishwajeet.dataStructures.array;

/*
* Given a binary array nums, return the maximum number of consecutive 1's in the array.
* */
public class MaxConsecutive {

    public int findMaxConsecutiveOnes(int[] nums) {
        int end = 0;
        int max = 0;
        for (int num : nums) {
            if (num == 1) {
                end++;
            } else {
                end = 0;
            }

            if (end > max) {
                max = end;
            }
        }
        System.gc();
        return max;
    }
}
