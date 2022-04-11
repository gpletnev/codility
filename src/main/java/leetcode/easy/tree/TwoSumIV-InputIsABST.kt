package leetcode.easy.tree

import leetcode.TreeNode
import java.util.*


// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
fun findTarget(root: TreeNode?, k: Int): Boolean {
    val leftItr = BSTIterator(root, false)
    val rightItr = BSTIterator(root, true)

    var left = leftItr.next()
    var right = rightItr.next()
    while (left < right) {
        if (left + right == k) return true
        if (left + right < k) left = leftItr.next() else right = rightItr.next()
    }
    return false
}

internal class BSTIterator(root: TreeNode?, private val reverse: Boolean) {
    private val stack = Stack<TreeNode>()

    init {
        push(root)
    }

    operator fun next(): Int {
        val top = stack.pop()
        push(if (!reverse) top.right else top.left)
        return top.`val`
    }

    private fun push(root: TreeNode?) {
        var node = root
        while (node != null) {
            stack.push(node)
            node = if (!reverse) node.left else node.right
        }
    }
}