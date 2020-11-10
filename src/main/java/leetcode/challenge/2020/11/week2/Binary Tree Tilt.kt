package leetcode.challenge.`2020`.`11`.week2

import leetcode.TreeNode

// https://leetcode.com/problems/binary-tree-tilt/
class BinaryTreeTilt {
    private var totalTilt = 0

    fun valueSum(node: TreeNode?): Int {
        if (node == null) return 0
        val leftSum = valueSum(node.left)
        val rightSum = valueSum(node.right)
        val tilt = Math.abs(leftSum - rightSum)
        totalTilt += tilt

        // return the sum of values starting from this node.
        return node.`val` + leftSum + rightSum
    }

    fun findTilt(root: TreeNode?): Int {
        this.totalTilt = 0
        this.valueSum(root)
        return this.totalTilt
    }
}