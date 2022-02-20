package leetcode.easy

import leetcode.TreeNode

// https://leetcode.com/problems/merge-two-binary-trees/
fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
    if (root1 == null && root2 == null) return null

    val root = TreeNode((root1?.`val` ?: 0) + (root2?.`val` ?: 0))
    root.left = mergeTrees(root1?.left, root2?.left)
    root.right = mergeTrees(root1?.right, root2?.right)
    return root
}