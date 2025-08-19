package com.bishwajeet.dataStructures.problems.linkedList

import java.util.*
import kotlin.collections.HashSet

class DuplicateInUnsortedLinkedList() {
    private val linkedList = LinkedList(listOf(10, 2, 76, 5, 9, 3, 23, 34, 40, 95, 71))

    fun findDuplicate(): Boolean {
        val hashSet = HashSet<Int>()
        for (item in linkedList) {
            if (hashSet.contains(item)) {
                return true
            } else {
                hashSet.add(item)
            }
        }
        return false
    }


}

fun main() {
    val duplicateInUnsortedLinkedList = DuplicateInUnsortedLinkedList()
    println("Is duplicate present? ${duplicateInUnsortedLinkedList.findDuplicate()}")
}