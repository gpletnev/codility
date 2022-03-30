package leetcode.easy.tree

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/binary-tree-postorder-traversal/
fun postorderTraversal(root: TreeNode?): List<Int> {
    val list = LinkedList<Int>()
    val stack = Stack<TreeNode>()
    stack.push(root)
    while (stack.isNotEmpty()) {
        val node = stack.pop() ?: continue
        list.addFirst(node.`val`)
        stack.push(node.left)
        stack.push(node.right)
    }

    return list
}