package leetcode.challenge.`2021`.`02`.week1

import leetcode.TreeNode

// https://leetcode.com/problems/binary-tree-right-side-view/
fun rightSideView(root: TreeNode?): List<Int> {
    val list = mutableListOf<Int>()
    rightSideView(root, 0, list)
    return list
}

fun rightSideView(root: TreeNode?, level: Int, list: MutableList<Int>) {
    if (root == null) return
    if (list.size == level) list.add(root.`val`)
    rightSideView(root.right, level + 1, list)
    rightSideView(root.left, level + 1, list)
}