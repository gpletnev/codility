package leetcode.medium

import java.util.*

// https://leetcode.com/problems/binary-tree-level-order-traversal/
object BinaryTreeLevelOrderTraversal {

    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val list = LinkedList<LinkedList<Int>>()
        levelOrderBottom(list, 0, root)
        return list
    }

    private fun levelOrderBottom(list: LinkedList<LinkedList<Int>>, level: Int, node: TreeNode?) {
        if (node == null) return

        if (list.lastIndex < level) list.add(LinkedList())

        list[level].add(node.`val`)
        levelOrderBottom(list, level + 1, node.left)
        levelOrderBottom(list, level + 1, node.right)
    }
}