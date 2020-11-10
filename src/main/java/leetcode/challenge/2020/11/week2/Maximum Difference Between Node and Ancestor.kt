package leetcode.challenge.`2020`.`11`.week2

import leetcode.TreeNode

// https://leetcode.com/problems/maximum-difference-between-node-and-ancestor/
fun maxAncestorDiff(root: TreeNode?): Int {
    return if (root == null) {
        0
    } else helper(root, root.`val`, root.`val`)
}

fun helper(node: TreeNode?, _curMax: Int, _curMin: Int): Int {
    // if encounter leaves, return the max-min along the path
    var curMax = _curMax
    var curMin = _curMin
    if (node == null) {
        return curMax - curMin
    }
    // else, update max and min
    // and return the max of left and right subtrees
    curMax = maxOf(curMax, node.`val`)
    curMin = minOf(curMin, node.`val`)
    val left = helper(node.left, curMax, curMin)
    val right = helper(node.right, curMax, curMin)
    return Math.max(left, right)
}