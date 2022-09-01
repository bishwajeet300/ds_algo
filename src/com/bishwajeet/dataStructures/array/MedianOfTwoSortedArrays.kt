package com.bishwajeet.dataStructures.array

object MedianOfTwoSortedArrays {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {

        var num1Pointer = 0
        var num2Pointer = 0
        val totalSize = nums1.size + nums2.size
        val mergedArray = IntArray(totalSize)
        val commonLength = Math.min(nums1.size, nums2.size)

        while (num1Pointer < commonLength && num2Pointer < commonLength) {
            if (nums1[num1Pointer] < nums2[num2Pointer]) {
                mergedArray[num1Pointer + num2Pointer] = nums1[num1Pointer]
                num1Pointer++
            } else {
                mergedArray[num1Pointer + num2Pointer] = nums2[num2Pointer]
                num2Pointer++
            }
        }

        return if (totalSize.rem(2) == 0) {
            ((mergedArray[(totalSize/2) - 1] + mergedArray[totalSize/2])/2.0)
        } else {
            mergedArray[totalSize/2].toDouble()
        }
    }
}

fun main() {
    println("Median: ${MedianOfTwoSortedArrays.findMedianSortedArrays(intArrayOf(1,3), intArrayOf(2,4))}")
}