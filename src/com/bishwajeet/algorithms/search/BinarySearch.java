package com.bishwajeet.algorithms.search;

/* Time Complexity -> O(log n) */
public class BinarySearch {

    private final int[] inputArray;

    public BinarySearch(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int getPositionOf(int toSearch) {
        return getPositionOf(toSearch, inputArray, 0, inputArray.length);
    }

    private int getPositionOf(int toSearch, int[] inputArray, int start, int end) {
        if (end >= start) {
            int mid = start + (end - start) / 2;

            if (inputArray[mid] == toSearch) {
                return mid;
            } else {
                if (inputArray[mid] > toSearch) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                return getPositionOf(toSearch, inputArray, start, end);
            }
        } else {
            return -1;
        }
    }
}