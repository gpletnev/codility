package leetcode.easy.tree

import leetcode.TreeNode

// https://leetcode.com/problems/search-in-a-binary-search-tree/
fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) return null

    return when {
        root.`val` > `val` -> searchBST(root.left, `val`)
        root.`val` < `val` -> searchBST(root.right, `val`)
        else -> root
    }
}