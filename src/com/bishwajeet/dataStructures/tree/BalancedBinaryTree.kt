package com.bishwajeet.dataStructures.tree

import kotlin.math.abs
import kotlin.math.max

class BalancedBinaryTree {

    fun isBalancedOne(root: TreeNode?): Boolean {
        if (root == null) return true

        val heightDiff: Int = getHeight(root.left) - getHeight(root.right)
        return if (abs(heightDiff) > 1) {
            false
        } else {
            isBalancedOne(root.left) && isBalancedOne(root.right)
        }
    }

    private fun getHeight(root: TreeNode?): Int {
        if (root == null) return -1

        return max(getHeight(root.left), getHeight(root.right)) + 1
    }

    fun isBalancedTwo(root: TreeNode?): Boolean {
        return checkHeight(root) != Int.MIN_VALUE
    }

    private fun checkHeight(root: TreeNode?): Int {
        if (root == null) return -1

        val leftHeight = checkHeight(root.left)
        if (leftHeight == Int.MIN_VALUE) return Int.MIN_VALUE

        val rightHeight = checkHeight(root.right)
        if (rightHeight == Int.MIN_VALUE) return Int.MIN_VALUE

        val heightDiff: Int = leftHeight - rightHeight
        return if (abs(heightDiff) > 1) {
            Int.MIN_VALUE
        } else {
            max(leftHeight, rightHeight) + 1
        }
    }
}