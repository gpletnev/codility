package leetcode.easy

import leetcode.TreeNode

// https://leetcode.com/problems/subtree-of-another-tree/
fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
    if (isSameTree(root, subRoot)) return true

    return isSubtree(root?.left, subRoot) || isSubtree(root?.right, subRoot)

}

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if (p == null && q == null) return true

    if (p != null && q != null) {
        if (p.`val` == q.`val`) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
        }
    }
    return false
}