package com.bishwajeet.algorithms.search;

/* Time Complexity -> O(n) */
public class LinearSearch {

    private final int[] inputArray;

    public LinearSearch(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getPositionOf(int toSearch) {
        for (int index = 0; index <= inputArray.length - 1; index++) {
            if (inputArray[index] == toSearch) {
                return index;
            }
        }
        return -1;
    }
}
