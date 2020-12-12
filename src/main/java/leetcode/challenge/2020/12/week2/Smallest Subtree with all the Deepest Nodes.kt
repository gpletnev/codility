package leetcode.challenge.`2020`.`12`.week2

import leetcode.TreeNode

// https://leetcode.com/problems/smallest-subtree-with-all-the-deepest-nodes/
fun subtreeWithAllDeepest(root: TreeNode): TreeNode? {
    return dfs(root).second
}

fun dfs(root: TreeNode?): Pair<Int, TreeNode?> {
    if (root == null) return Pair(0, null)

    val left = dfs(root.left)
    val right = dfs(root.right)
    val leftDeep: Int = left.first
    val rightDeep: Int = right.first
    return Pair(
        Math.max(leftDeep, rightDeep) + 1,
        if (leftDeep == rightDeep) root else if (leftDeep > rightDeep) left.second else right.second
    )
}