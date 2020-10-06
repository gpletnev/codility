package leetcode.challenge.`2020`.`10`.week1

import leetcode.TreeNode

// https://leetcode.com/problems/insert-into-a-binary-search-tree/
fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
    if (root == null) {
        return TreeNode(`val`)
    }
    if (root.`val` > `val`) {
        root.left = insertIntoBST(root.left, `val`)
    } else {
        root.right = insertIntoBST(root.right, `val`)
    }
    return root
}