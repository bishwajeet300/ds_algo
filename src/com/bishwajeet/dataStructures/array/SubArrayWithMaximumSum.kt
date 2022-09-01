package com.bishwajeet.dataStructures.array

import kotlin.math.max

object SubArrayWithMaximumSum {
    fun maxSubArraySum(nums: IntArray): Int {

        var maxTillNow = nums[0]
        var currentMax = nums[0]

        for(position in 1 until nums.size) {
            currentMax = max(nums[position], currentMax + nums[position])
            maxTillNow = max(maxTillNow, currentMax)
        }

        return maxTillNow
    }
}

fun main() {
    println("MaxSum: ${SubArrayWithMaximumSum.maxSubArraySum(intArrayOf(-2,1,-3,4,-1,2,1,-5,4))}")
}