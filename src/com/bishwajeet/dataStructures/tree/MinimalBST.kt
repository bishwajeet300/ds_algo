package com.bishwajeet.dataStructures.tree

class MinimalBST {

    fun createMinimalBST(array: ArrayList<Int>): TreeNode? {
        return createMinimalBST(array, 0, array.size - 1)
    }

    private fun createMinimalBST(array: ArrayList<Int>, start: Int, end: Int): TreeNode? {
        if (end < start) return null

        val mid: Int = (start + end).div(2)

        val newNode = TreeNode(array[mid])
        newNode.left = createMinimalBST(array, start, mid - 1)
        newNode.right = createMinimalBST(array, mid + 1, end)
        return newNode
    }
}