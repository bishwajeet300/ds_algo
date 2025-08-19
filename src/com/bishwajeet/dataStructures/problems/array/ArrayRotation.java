package com.bishwajeet.dataStructures.problems.array;

import java.util.Arrays;

public class ArrayRotation {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int k = 14;

//        int x = 3%5;
//        int y = 10%5;
//        int z = 13%5;
//
//        System.out.println("3%5 = " + x);
//        System.out.println("10%5 = " + y);
//        System.out.println("13%5 = " + z);

        System.out.println("args = " + Arrays.toString(rotate(nums, k)));
    }

    public static int[] rotate(int[] nums, int k) {
        k = k % (nums.length);
        int[] lastKValue = new int[k];
        if (nums.length - (nums.length - k) >= 0)
            System.arraycopy(nums, nums.length - k, lastKValue, -k + k, nums.length - (nums.length - k));

        for (int j = nums.length - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

        System.arraycopy(lastKValue, 0, nums, 0, k);
        return nums;
    }
}
