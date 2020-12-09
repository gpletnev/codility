package leetcode.challenge.`2020`.`12`.week2

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/binary-search-tree-iterator/
class BSTIterator(_root: TreeNode?) {

    val stack = Stack<TreeNode>()

    init {
        leftMostInorder(_root)
    }

    fun next(): Int {
        val node = stack.pop()
        if (node.right != null) {
            leftMostInorder(node.right)
        }

        return node.`val`
    }

    fun hasNext(): Boolean {
        return stack.size > 0
    }

    private fun leftMostInorder(_root: TreeNode?) {
        var root = _root
        while (root != null) {
            this.stack.push(root)
            root = root.left
        }
    }
}