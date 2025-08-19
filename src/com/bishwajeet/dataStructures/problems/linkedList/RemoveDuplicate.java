package com.bishwajeet.dataStructures.problems.linkedList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicate {
    private final LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10, 2, 76, 5, 9, 3, 23, 34, 40, 95, 71));
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
    }

    public static void deleteDups(LinkedList<Integer> linkedList) {
        HashSet<Integer> set = new HashSet<>();

    }
}
