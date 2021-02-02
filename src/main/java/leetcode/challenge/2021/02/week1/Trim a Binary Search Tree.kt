package leetcode.challenge.`2021`.`02`.week1

import leetcode.TreeNode

// https://leetcode.com/problems/trim-a-binary-search-tree/
fun trimBST(root: TreeNode?, low: Int, high: Int): TreeNode? {
    if (root == null) return root
    if (root.`val` > high) return trimBST(root.left, low, high)
    if (root.`val` < low) return trimBST(root.right, low, high)
    root.left = trimBST(root.left, low, high)
    root.right = trimBST(root.right, low, high)
    return root
}