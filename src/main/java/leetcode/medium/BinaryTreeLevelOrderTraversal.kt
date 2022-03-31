package leetcode.medium

import leetcode.TreeNode
import java.util.*


// https://leetcode.com/problems/binary-tree-level-order-traversal/
object BinaryTreeLevelOrderTraversal {

//    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
//        val list = LinkedList<LinkedList<Int>>()
//        levelOrderBottom(list, 0, root)
//        return list
//    }
//
//    private fun levelOrderBottom(list: LinkedList<LinkedList<Int>>, level: Int, node: TreeNode?) {
//        if (node == null) return
//
//        if (list.lastIndex < level) list.add(LinkedList())
//
//        list[level].add(node.`val`)
//        levelOrderBottom(list, level + 1, node.left)
//        levelOrderBottom(list, level + 1, node.right)
//    }

    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val list: MutableList<List<Int>> = LinkedList()
        val queue: Queue<TreeNode?> = LinkedList()
        if (root != null) queue.add(root)
        while (queue.isNotEmpty()) {
            val level = mutableListOf<Int>()
            repeat(queue.size) {
                val node = queue.poll()
                node!!.left?.let { queue.add(node.left) }
                node.right?.let { queue.add(node.right) }
                level.add(node.`val`)
            }
            list.add(level)
        }
        return list
    }
}