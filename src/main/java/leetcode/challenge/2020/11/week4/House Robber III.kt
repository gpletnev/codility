package leetcode.challenge.`2020`.`11`.week4

import leetcode.TreeNode

// https://leetcode.com/problems/house-robber-iii/
fun rob(root: TreeNode?): Int {
    val answer = helper(root)
    return Math.max(answer[0], answer[1])
}

fun helper(node: TreeNode?): IntArray {
    // return [rob this node, not rob this node]
    if (node == null) {
        return intArrayOf(0, 0)
    }
    val left = helper(node.left)
    val right = helper(node.right)
    // if we rob this node, we cannot rob its children
    val rob = node.`val` + left[1] + right[1]
    // else, we free to choose rob its children or not
    val notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1])
    return intArrayOf(rob, notRob)
}