package com.bishwajeet.dataStructures.array;


// TODO("Needs to be done")
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int count = nums.length;
        for (int i = 1; i <= nums.length; i++) {
            if (nums[i - 1] == val) {
                if (i == nums.length) {
                    nums[i - 1] = 0;
                } else {
                    nums[i - 1] = nums[i];
                }

                count--;
            }
        }

        printArray(nums);
        return count;
    }

    private static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
