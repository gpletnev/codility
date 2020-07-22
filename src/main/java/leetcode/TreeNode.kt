package leetcode

import java.util.*

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class BinaryTree(tree: List<Int?>) {
    var head: TreeNode? = null

    init {
        if (tree.isNotEmpty()) {
            val iterator = tree.listIterator()
            head = iterator.next()?.let { TreeNode(it) }
            val queue = LinkedList<TreeNode?>()
            queue.add(head!!)
            while (queue.isNotEmpty() && iterator.hasNext()) {
                val node = queue.poll()
                val left: Int? = iterator.next()
                val right: Int? = iterator.next()
                if (left != null) node?.left = TreeNode(left)
                if (right != null) node?.right = TreeNode(right)
                queue.add(node?.left)
                queue.add(node?.right)
            }
        }
    }
}