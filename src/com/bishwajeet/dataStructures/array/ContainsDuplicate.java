package com.bishwajeet.dataStructures.array;

import com.bishwajeet.algorithms.sort.SelectionSort;

import java.util.HashSet;

/*
* Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
* */
public class ContainsDuplicate {

    private final int[] numbers;

    public ContainsDuplicate(int[] numbers) {
        this.numbers = numbers;
    }

    // Time Complexity: O(n log n) + O(n)
    public boolean containsDuplicate_BySorting() {
        int[] sortedNumbers = new SelectionSort(numbers).sort();

        for (int counter = 0; counter < sortedNumbers.length - 1; counter++) {
            if (sortedNumbers[counter] == sortedNumbers[counter + 1]) {
                return true;
            }
        }
        return false;
    }

    // Time Complexity: O(n) + O(n)
    public boolean containsDuplicate_ByHashSet() {
        HashSet<Integer> numbersHashSet = new HashSet<>();

        for (Integer number : numbers) {
            if (numbersHashSet.contains(number)) {
                return true;
            } else {
                numbersHashSet.add(number);
            }
        }
        return false;
    }
}
