package com.bishwajeet.algorithms.sort;

/* The selection sort algorithm sorts an array by repeatedly finding the minimum element from unsorted part and putting it at the beginning. */
/* Time Complexity -> O(n^2) */
public class SelectionSort {

    private final int[] inputArray;

    public SelectionSort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] sort() {
        int[] outputArray = inputArray.clone();

        for (int outerIndex = 0; outerIndex <= outputArray.length - 1; outerIndex++) {
            int minIndex = outerIndex;
            for (int innerIndex = outerIndex + 1; innerIndex < outputArray.length; innerIndex++) {
                if (outputArray[innerIndex] < outputArray[minIndex]) {
                    minIndex = innerIndex;
                }
            }
            int temp = outputArray[outerIndex];
            outputArray[outerIndex] = outputArray[minIndex];
            outputArray[minIndex] = temp;
        }

        printArray(outputArray);
        return outputArray;
    }

    void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
