package leetcode.challenge.july2020.week1

import java.util.*

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
object BinaryTreeLevelOrderTraversal_II {

    fun levelOrderBottom(root: TreeNode?): List<List<Int>> {
        val list = LinkedList<LinkedList<Int>>()
        levelOrderBottom(list, 0, root)
        return list
    }

    private fun levelOrderBottom(list: LinkedList<LinkedList<Int>>, level: Int, node: TreeNode?) {
        if (node == null) return

        if (list.lastIndex < level) list.addFirst(LinkedList())

        list[list.lastIndex - level].add(node.`val`)
        levelOrderBottom(list, level + 1, node.left)
        levelOrderBottom(list, level + 1, node.right)
    }
}