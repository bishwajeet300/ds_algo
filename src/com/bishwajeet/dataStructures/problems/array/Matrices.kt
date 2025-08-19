package com.bishwajeet.dataStructures.problems.array

class Matrices {
    fun solution(times: MutableList<MutableList<Int>>): Int {

        var result = 0
        var lastColour = -1
        for(fence in times) {
            var min = Int.MAX_VALUE
            var currentColour = 0
            for (color in fence) {
                if (color < min && lastColour != currentColour) {
                    min = color
                    lastColour = currentColour
                    result += color
                }
                currentColour += 1
            }
        }
        return result
    }
}