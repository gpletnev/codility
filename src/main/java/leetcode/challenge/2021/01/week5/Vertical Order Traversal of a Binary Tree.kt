package leetcode.challenge.`2021`.`01`.week5

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
class Solution {
    private val map = TreeMap<Int, PriorityQueue<Node>>()

    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        traverse(root, 0, 0)
        val list = mutableListOf<List<Int>>()
        for ((_, report) in map) {
            val orderedReport = mutableListOf<Int>()
            while (report.isNotEmpty()) {
                orderedReport += report.poll().id
            }
            list += orderedReport
        }
        return list
    }

    private fun traverse(root: TreeNode?, x: Int, y: Int) {
        if (root == null) {
            return
        }
        map.getOrPut(x, ::PriorityQueue).apply { offer(Node(root.`val`, y)) }
        traverse(root.left, x - 1, y - 1)
        traverse(root.right, x + 1, y - 1)
    }

    private data class Node(val id: Int, val y: Int) : Comparable<Node> {
        override fun compareTo(other: Node): Int {
            if (this.y == other.y) {
                return this.id - other.id
            }
            return other.y - this.y
        }
    }
}