package leetcode.challenge.`2020`.`12`.week3

import leetcode.TreeNode

// https://leetcode.com/problems/validate-binary-search-tree/
fun isValidBST(root: TreeNode?): Boolean {
    return isValidBST(root, null, null)
}

fun isValidBST(root: TreeNode?, min: Int?, max: Int?): Boolean {
    if (root != null) {
        if (min != null && root.`val` <= min) return false
        if (max != null && root.`val` >= max) return false
        return isValidBST(root.left, min, root.`val`) && isValidBST(root.right, root.`val`, max)
    }
    return true
}