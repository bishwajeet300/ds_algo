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

        for (int count = 0; count < nums.length; count++) {
            arr[count] = nums[count] * nums[count];
        }

        Arrays.sort(arr);

        return arr;
    }
}
