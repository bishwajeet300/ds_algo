package com.bishwajeet.dataStructures.problems.strings;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstringWithoutRepeatJava {

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        int maxLength = Integer.MIN_VALUE;
        Queue<Character> queue = new LinkedList<>();
        for(int count = 0; count < s.length(); count++) {
            if (queue.contains(s.charAt(count))) {
                while(queue.peek() != s.charAt(count)) {
                    queue.poll();
                }
                queue.poll();
            }
            queue.add(s.charAt(count));

            if (queue.size() > maxLength) {
                maxLength = queue.size();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println("Result: " + lengthOfLongestSubstring(" "));
    }
}