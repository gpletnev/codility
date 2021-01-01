package leetcode.challenge.`2020`.`05`.week3

import java.util.*

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
object KthSmallestElementInBST {
    fun kthSmallest(root: TreeNode?, k: Int): Int {
        val stack = Stack<TreeNode>()
        var node = root
        var i = k

        while (true) {
            while (node != null) {
                stack.push(node)
                node = node.left
            }
            node = stack.pop()
            if (--i == 0) return node.`val`
            node = node.right
        }
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}