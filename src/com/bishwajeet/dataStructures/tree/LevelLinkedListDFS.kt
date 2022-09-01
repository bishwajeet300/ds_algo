package com.bishwajeet.dataStructures.tree

import java.util.*
import kotlin.collections.ArrayList

class LevelLinkedListDFS {

    fun createLevelLinkedList(root: TreeNode): ArrayList<LinkedList<TreeNode>> {
        val lists = ArrayList<LinkedList<TreeNode>>()
        createLevelLinkedList(root, lists, 0)
        return lists
    }


    private fun createLevelLinkedList(root: TreeNode?, lists: ArrayList<LinkedList<TreeNode>>, level: Int) {
        if (root == null) return

        val list : LinkedList<TreeNode>
        if (lists.size == level) {
            list = LinkedList<TreeNode>()
            lists.add(list)
        } else {
            list = lists[level]
        }

        list.add(root)

        createLevelLinkedList(root.left, lists, level + 1)
        createLevelLinkedList(root.right, lists, level + 1)
    }
}