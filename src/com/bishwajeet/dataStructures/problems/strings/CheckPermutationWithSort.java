package com.bishwajeet.dataStructures.problems.strings;

import java.util.Arrays;

public class CheckPermutationWithSort {

    public static void main(String[] args) {
        System.out.println("args = " + checkPermutation("dog", "god"));
    }

    private static boolean checkPermutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return sort(s).equals(sort(t));
    }

    private static String sort(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
