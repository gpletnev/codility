package leetcode.easy.tree

import leetcode.TreeNode

// https://leetcode.com/problems/path-sum/
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root != null) {
        return if (root.left == null && root.right == null && root.`val` == targetSum)
            true
        else
            hasPathSum(root.left, targetSum - root.`val`) || hasPathSum(root.right, targetSum - root.`val`)
    }
    return false
}