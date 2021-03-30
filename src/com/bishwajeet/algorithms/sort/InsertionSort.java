package com.bishwajeet.algorithms.sort;

/* To sort an array of size n in ascending order:
1: Iterate from arr[1] to arr[n] over the array.
2: Compare the current element (key) to its predecessor.
3: If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element. */

/* Time Complexity -> O(n^2) */
/* Performance could be improved by using Binary search to find smallest number */
public class InsertionSort {

    private final int[] inputArray;

    public InsertionSort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public int[] sort() {
        int[] outputArray = inputArray.clone();

//        for (int innerIndex = 1; innerIndex <= outputArray.length - 1; innerIndex++) {
//            if (i)
//        }

        printArray(outputArray);
        return outputArray;
    }

    void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
