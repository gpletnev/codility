package leetcode.easy.tree

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/binary-tree-inorder-traversal/
fun inorderTraversal(root: TreeNode?): List<Int> {
    val list = LinkedList<Int>()
    val stack = Stack<TreeNode>()
    var node = root
    while (node != null || stack.isNotEmpty()) {
        while (node != null) {
            stack.push(node)
            node = node.left
        }
        node = stack.pop()
        list.add(node.`val`)
        node = node.right
    }

    return list
}