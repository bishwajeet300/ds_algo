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
        boolean isSwapped;
        int compare = 0;
        int swap = 0;

        for (int outerIndex = 0; outerIndex < outputArray.length; outerIndex++) {
            isSwapped = false;
            for (int innerIndex = 1; innerIndex < outputArray.length - outerIndex; innerIndex++) {
                compare++;
                if (outputArray[innerIndex - 1] > outputArray[innerIndex]) {
                    int temp = outputArray[innerIndex - 1];
                    outputArray[innerIndex - 1] = outputArray[innerIndex];
                    outputArray[innerIndex] = temp;
                    swap++;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                printArray(outputArray, compare, swap);
                return outputArray;
            }
        }

        printArray(outputArray, compare, swap);
        return outputArray;
    }

    void printArray(int[] arr, int c, int s) {
        System.out.print("Bubble Sort [Swaps: " + s + ", Compare: " + c + "], Sorted Array : ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        BubbleSort b = new BubbleSort(new int[]{6,9,5,3,1,8,7,2,4});
        b.sort();
    }
}