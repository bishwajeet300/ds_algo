package com.bishwajeet.dataStructures.problems.strings;

import java.util.Arrays;
import java.util.HashMap;

public class FirstUniqueChar {

    public static void main(String[] args) {
        System.out.println("args = " + firstUniqChar("leetcode"));
        System.out.println("args = " + firstUniqChar("loveleetcode"));
        System.out.println("args = " + firstUniqChar("aabb"));
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}

