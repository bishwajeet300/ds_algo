package com.bishwajeet.dataStructures.problems.array;

/*
* Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
* The number of elements initialized in nums1 and nums2 are m and n respectively.
* You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.
* */
//TODO("Issues while approaching backwards. Check with forward approach.")
public class MergeSortedArray {

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
        } else {

            int p1 = m - 1;
            int p2 = n - 1;
            int pos = m + n - 1;
            while (p2 >= 0 && p1 >= 0) {
                if (nums2[p2] >= nums1[p1]) {
                    nums1[pos] = nums2[p2];
                    p2--;
                    pos--;
                } else {
                    nums1[pos] = nums1[p1];
                    p1--;
                    pos--;
                }
            }
        }
        return nums1;
    }
}
