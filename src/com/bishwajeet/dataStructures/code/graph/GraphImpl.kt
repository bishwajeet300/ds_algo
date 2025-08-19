package com.bishwajeet.dataStructures.code.graph

import java.util.*
import kotlin.collections.ArrayList

class GraphImpl(private val nodes: ArrayList<GraphNode>) {

    fun breadthFirstSearch(root: GraphNode, target: GraphNode): Boolean {
        if (root == target) return true

        val queue = LinkedList<GraphNode>()

        root.state = State.Visiting
        queue.add(root)

        while (queue.isEmpty().not()) {
            val visitingNode = queue.removeFirst()
            if (visitingNode != null) {
                visitingNode.adjacent?.forEach {
                    if (it.state == State.Unvisited) {
                        if (it == target) {
                            return true
                        } else {
                            it.state = State.Visiting
                            queue.add(it)
                        }
                    }
                }
                visitingNode.state = State.Visited
            }
        }
        return false
    }

    fun depthFirstSearch(root: GraphNode, target: GraphNode): Boolean {
        if (root == target) return true

        root.state = State.Visited

        root.adjacent?.forEach {
            if (it.state == State.Unvisited) {
                depthFirstSearch(it, target)
            }
        }
        return false
    }
}

data class GraphNode(
        var value: Int,
        var state: State = State.Unvisited,
        var adjacent: ArrayList<GraphNode>?
)

enum class State {
    Unvisited, Visited, Visiting
}