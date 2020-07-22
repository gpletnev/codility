package leetcode.challenge.july2020.week2

import leetcode.TreeNode

// https://leetcode.com/problems/same-tree/
fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true

    if (p != null && q != null) {
        if (p.`val` == q.`val`) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
    return false
}