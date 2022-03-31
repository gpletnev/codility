package leetcode.easy.tree

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/symmetric-tree/
fun isSymmetric(root: TreeNode?): Boolean {
    if (root == null) return true
    val leftStack = Stack<TreeNode>()
    val rightStack = Stack<TreeNode>()

    when {
        root.left == null && root.right == null -> return true
        root.left == null || root.right == null -> return false
        else -> {
            leftStack.push(root.left)
            rightStack.push(root.right)
        }
    }

    while (leftStack.isNotEmpty() && rightStack.isNotEmpty()) {
        val left = leftStack.pop()
        val right = rightStack.pop()

        if (left.`val` != right.`val`) return false

        if (left.left?.`val` == right.right?.`val` &&
            left.right?.`val` == right.left?.`val`
        ) {
            left.left?.let { leftStack.push(left.left) }
            left.right?.let { leftStack.push(left.right) }

            right.right?.let { rightStack.push(right.right) }
            right.left?.let { rightStack.push(right.left) }

        } else {
            return false
        }
    }

    return leftStack.isEmpty() && rightStack.isEmpty()
}