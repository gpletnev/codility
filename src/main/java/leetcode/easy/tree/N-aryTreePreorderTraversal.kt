package leetcode.easy.tree

import java.util.*

class Node(var `val`: Int) {
    var children: List<Node?> = listOf()
}

// https://leetcode.com/problems/n-ary-tree-preorder-traversal/
fun preorder(root: Node?): List<Int> {
    val list = mutableListOf<Int>()
    val stack = Stack<Node>()

    if (root != null) stack.push(root)

    while (stack.isNotEmpty()) {
        val node = stack.pop()
        list.add(node.`val`)
        node.children.asReversed().forEach { stack.push(it) }
    }

    return list
}