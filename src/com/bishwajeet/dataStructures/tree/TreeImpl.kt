package com.bishwajeet.dataStructures.tree

class TreeImpl(private val root: TreeNode?) {

    fun traverseTree(type: TraversalType) {
        when (type) {
            TraversalType.PRE_ORDER -> preOrder(root)
            TraversalType.IN_ORDER -> inOrder(root)
            TraversalType.POST_ORDER -> postOrder(root)
        }
    }

    private fun preOrder(node: TreeNode?) {
        if (node != null) {
            println(node.value)
            preOrder(node.left)
            preOrder(node.right)
        }
    }

    private fun inOrder(node: TreeNode?) {
        if (node != null) {
            inOrder(node.left)
            println(node.value)
            inOrder(node.right)
        }
    }

    private fun postOrder(node: TreeNode?) {
        if (node != null) {
            postOrder(node.left)
            postOrder(node.right)
            println(node.value)
        }
    }
}


enum class TraversalType {
    PRE_ORDER, IN_ORDER, POST_ORDER
}

data class TreeNode(
        var value: Int,
        var left: TreeNode? = null,
        var right: TreeNode? = null
)
