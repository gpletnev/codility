package leetcode.challenge.`2020`.`12`.week1

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/increasing-order-search-tree/
fun increasingBST(root: TreeNode?): TreeNode? {
    root ?: return root

    val stack = Stack<TreeNode>()
    var active = root

    val newRoot = TreeNode(-1)
    var iterator = newRoot

    while (active != null || stack.isNotEmpty()) {
        if (active != null) {
            stack.push(active)
            active = active.left
        } else {
            val node = stack.pop()
            active = node.right

            node.left = null
            node.right = null

            iterator.right = node
            iterator = node
        }
    }
    return newRoot.right

//    return increasingBST(root, null)
}

fun increasingBST(root: TreeNode?, tail: TreeNode?): TreeNode? {
    if (root == null) return tail
    val node = increasingBST(root.left, root)
    root.left = null
    root.right = increasingBST(root.right, tail)
    return node
}