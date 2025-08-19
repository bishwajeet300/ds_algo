package com.bishwajeet.dataStructures.code.tree

import com.bishwajeet.dataStructures.problems.tree.TreeNode
import java.util.*
import kotlin.collections.ArrayList

class LevelLinkedListBFS {

    fun createLevelLinkedList(root: TreeNode?): ArrayList<LinkedList<TreeNode>> {
        val lists = ArrayList<LinkedList<TreeNode>>()

        var current = LinkedList<TreeNode>()
        if (root != null) {
            current.add(root)
        }

        while (current.size > 0) {
            lists.add(current)
            val parents = current
            current = LinkedList<TreeNode>()
            parents.forEach { parent ->
                if (parent.left != null) {
                    current.add(parent.left!!)
                }

                if (parent.right != null) {
                    current.add(parent.right!!)
                }
            }

        }

        return lists
    }
}