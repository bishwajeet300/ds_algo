package com.bishwajeet.dataStructures.problems.strings;

import java.util.Arrays;

public class CheckPermutationWithCharCount {

    public static void main(String[] args) {
//        System.out.println("args = " + permutation("", ""));

        int[] nums = new int[]{2,4,6,8,10, 12, 14, 16, 18, 20};
        int k = 4;

        System.out.println("args = " + (nums.length - (k%nums.length)));
//        for (int i = nums.length - k; i <= nums.length - 1; i++) {
//            System.out.print("K [] " + i);
//            System.out.println(" K -> " + nums[i]);
//        }
//
//        for (int j = nums.length - k - 1; j >= 0; j--) {
//            System.out.print("Shift [from] " + j);
//            System.out.print(" Shift [to] " + (j+k));
//            System.out.println(" Shift -> " + nums[j]);
//        }

    }

//    private static boolean permutation(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//
//
//    }
}
