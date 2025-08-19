package com.bishwajeet.dataStructures.problems.array;
/*
* Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
* Note that elements beyond the length of the original array are not written.
* Do the above modifications to the input array in place, do not return anything from your function.
* */
public class DuplicateZeros {

    public int[] duplicateZeros(int[] arr) {
        for (int pos = 0; pos < arr.length - 1; pos++) {
            if (arr[pos] == 0) {
                for (int i = arr.length - 1; i > pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos + 1] = 0;
                pos++;
            }
        }
        System.gc();
        return arr;
    }
}
