package com.bishwajeet.dataStructures.array

import java.util.*

object SubArrayWithGivenSum {
    fun subArraySum(arr: IntArray, n: Int, s: Int): ArrayList<Int> {
        val output = ArrayList<Int>()
        for (startingPosition in 0..arr.size) {
            var sum = 0
            var slidingPosition = startingPosition
            while (sum <= s && slidingPosition < n) {
                sum += arr[slidingPosition]
                if (sum == s) {
                    output.add(startingPosition + 1)
                    output.add(slidingPosition + 1)
                    return output
                }
                slidingPosition++
            }
        }
        output.add(-1)
        return output
    }
}

fun main() {
    println("${SubArrayWithGivenSum.subArraySum(intArrayOf(-2,1,-3,4,-1,2,1,-5,4), 5, 6)}")
}