package com.bishwajeet.algorithms.sort;

public class MergeSort {

    private final int[] inputArray;

    public MergeSort(int[] inputArray) {
        this.inputArray = inputArray;
    }

    public void sort() {
        int[] outputArray = inputArray.clone();
        int compare = 0;
        int swap = 0;

        // Code goes here
        int start = 0;
        int end  = outputArray.length;

        mergeSort(outputArray, start, end);


        printArray(outputArray, compare, swap);
    }

    int[] mergeSort(int[] outputArray, int start, int end) {
        int mid = ((start + end)/2) + 1;

        if (outputArray[start] > outputArray[end]) {
            
        }

        return outputArray;
    }

    void printArray(int[] arr, int c, int s) {
        System.out.print("Merge Sort [Swaps: " + s + ", Compare: " + c + "], Sorted Array : ");
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        MergeSort m = new MergeSort(new int[]{6,9,5,3,1,8,7,2,4});
        m.sort();
    }
}
