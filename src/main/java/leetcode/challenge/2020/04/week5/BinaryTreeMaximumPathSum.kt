package leetcode.challenge.`2020`.`04`.week5

import leetcode.TreeNode

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
object BinaryTreeMaximumPathSum {

    private var maximumPathSum: Int? = null

    fun maxPathSum(root: TreeNode?): Int {
        maxPathDeep(root)
        return maximumPathSum!!
    }

    private fun maxPathDeep(root: TreeNode?): Int {
        if (root == null) return 0

        val leftPathSum = if (root.left != null) maxPathDeep(root.left) else 0
        val rightPathSum = if (root.right != null) maxPathDeep(root.right) else 0

        val leftPathRootSum = leftPathSum + root.`val`
        val rightPathRootSum = rightPathSum + root.`val`
        val rootTreeSum = leftPathSum + rightPathSum + root.`val`

        val rootMaximum = maxOf(maxOf(leftPathRootSum, rightPathRootSum, rootTreeSum), root.`val`)
        maximumPathSum = maximumPathSum?.let { maxOf(it, rootMaximum) } ?: rootMaximum
        return maxOf(leftPathRootSum, rightPathRootSum, root.`val`)
    }
}