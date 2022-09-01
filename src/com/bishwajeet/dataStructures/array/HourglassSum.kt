package com.bishwajeet.dataStructures.array

class HourglassSum {
    fun hourglassSum(arr: List<List<Int>>): Int {
        // Write your code here
        var maxSum = Int.MIN_VALUE
        for (i in 0 until arr.size - 2) {
            for (j in 0 until arr[i].size - 2) {
                val tempSum = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2]
                        + arr[i + 1][j + 1]
                        + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2])
                if (tempSum > maxSum) {
                    maxSum = tempSum
                }
            }
        }
        return maxSum
    }
}