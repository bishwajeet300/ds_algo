package com.bishwajeet.algorithms.sort;

/* Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order. */
/* Time Complexity -> O(n^2) */
public class BubbleSort {

    private final int[] inputArray;

    public BubbleSort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] sort() {
        int[] outputArray = inputArray.clone();

        for (int outerIndex = 0; outerIndex < outputArray.length - 1; outerIndex++) {
            for (int innerIndex = 0; innerIndex < outputArray.length - outerIndex - 1; innerIndex++) {
                if (outputArray[innerIndex] > outputArray[innerIndex + 1]) {
                    int temp = outputArray[innerIndex];
                    outputArray[innerIndex] = outputArray[innerIndex + 1];
                    outputArray[innerIndex + 1] = temp;
                }
            }
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