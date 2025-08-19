package com.bishwajeet.dataStructures.problems.array

/*
* Given a binary array nums, return the maximum number of consecutive 1's in the array.
* */
class MaxConsecutive {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var end = 0
        var max = 0
        for (num in nums) {
            if (num == 1) {
                end++
            } else {
                end = 0
            }
            if (end > max) {
                max = end
            }
        }
        System.gc()
        return max
    }
}