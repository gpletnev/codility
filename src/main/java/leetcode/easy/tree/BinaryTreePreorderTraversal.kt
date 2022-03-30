package leetcode.easy.tree

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/binary-tree-preorder-traversal/
fun preorderTraversal(root: TreeNode?): List<Int> {
    val list = LinkedList<Int>()
    val stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        val node = stack.pop() ?: continue
        list.add(node.`val`)
        stack.push(node.right)
        stack.push(node.left)
    }

    return list
}