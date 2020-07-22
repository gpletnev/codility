package leetcode.challenge.july2020.week4

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val result = LinkedList<LinkedList<Int>>()
    if (root != null) {
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        var order = true
        while (queue.isNotEmpty()) {
            val list = LinkedList<Int>()
            repeat(queue.size) {
                val node = queue.poll()
                if (order) list.add(node.`val`) else list.addFirst(node.`val`)

                node.left?.let { queue.add(it) }
                node.right?.let { queue.add(it) }
            }
            result.add(list)
            order = !order
        }
    }
    return result
}