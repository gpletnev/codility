package leetcode.challenge.`2020`.`12`.week4

import leetcode.TreeNode
import kotlin.math.abs

// https://leetcode.com/problems/balanced-binary-tree/
fun isBalanced(root: TreeNode?): Boolean {
    return height(root) != -1
}

private fun height(node: TreeNode?): Int {
    if (node == null) return 0

    val left = height(node.left)
    val right = height(node.right)
    return if (left == -1 || right == -1 || abs(left - right) > 1) -1 else maxOf(left, right) + 1
}