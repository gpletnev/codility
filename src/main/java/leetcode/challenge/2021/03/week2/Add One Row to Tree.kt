package leetcode.challenge.`2021`.`03`.week2

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/add-one-row-to-tree/
fun addOneRow(root: TreeNode, v: Int, d: Int): TreeNode {
    val fakeRoot = TreeNode(0)
    fakeRoot.left = root

    val queue = LinkedList<Pair<TreeNode, Int>>()
    queue.push(Pair(fakeRoot, 0))

    while (queue.isNotEmpty()) {
        val (node, depth) = queue.pop()

        if (depth == d - 1) {
            val left = TreeNode(v)
            left.left = node.left
            node.left = left

            val right = TreeNode(v)
            right.right = node.right
            node.right = right
        }

        if (depth < d - 1) {
            if (node.left != null) queue.addLast(Pair(node.left!!, depth + 1))
            if (node.right != null) queue.addLast(Pair(node.right!!, depth + 1))
        }
    }

    return fakeRoot.left!!
}