package com.bishwajeet.dataStructures.array;

import java.util.Arrays;
import java.util.Collections;

/*
* Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
* Find O(n) solution.
* */
public class SquaresArray {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int arrCounter = end;

        while(start <= end) {
            if (nums[start] < 0 && (nums[start]*(-1) >= nums[end])) {
                arr[arrCounter] = nums[start] * nums[start];
                start++;
            } else {
                arr[arrCounter] = nums[end] * nums[end];
                end--;
            }
            arrCounter--;
        }


        return arr;
    }
}
