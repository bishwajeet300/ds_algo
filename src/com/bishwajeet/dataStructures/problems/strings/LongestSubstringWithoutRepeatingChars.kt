package com.bishwajeet.dataStructures.problems.strings

import java.util.*

object LongestSubstringWithoutRepeatingChars {

    fun longestUniqueSubString(s: String): Int {

        if (s.isEmpty()) return 0

        val queue: Queue<Char> = LinkedList()
        var maxLength = Int.MIN_VALUE

        for (c in s) {
            if (queue.contains(c)) {
                // slide window
                while (queue.peek() != c) {
                    queue.poll()
                }
                queue.poll() // remove first instance of duplicate char
            }

            queue.add(c)
            if (queue.size > maxLength) {
                maxLength = queue.size
            }
        }

        return maxLength
    }

    private fun printQueue(q: Queue<Char>) {
        println(q.toString())
    }
}

fun main() {
    println("Length = ${LongestSubstringWithoutRepeatingChars.longestUniqueSubString("abcdb")}")
}