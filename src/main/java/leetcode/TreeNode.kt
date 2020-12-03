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
                val node = queue.poll() ?: continue
                val left: Int? = iterator.next()
                if (left != null) node.left = TreeNode(left)
                queue.add(node.left)
                if (iterator.hasNext()) {
                    val right: Int? = iterator.next()
                    if (right != null) node.right = TreeNode(right)
                    queue.add(node.right)
                }
            }
        }
    }
}

fun TreeNode?.joinToString(separator: CharSequence = ", ", prefix: CharSequence = "", postfix: CharSequence = "", limit: Int = -1, truncated: CharSequence = "..."): String {
    if (this == null) return ""
    val sb = StringBuilder()
    sb.append(prefix)
    val queue = LinkedList<TreeNode>()
    queue.offer(this)
    sb.append(this.`val`)
    var count = 1
    while (queue.isNotEmpty()) {
        val node = queue.poll()
        if (node.left != null) {
            queue.offer(node.left)
            sb.append(separator)
            sb.append(node.left!!.`val`)
        } else {
            sb.append(separator)
            sb.append("null")
        }
        count++

        if (node.right != null) {
            queue.offer(node.right)
            sb.append(separator)
            sb.append(node.right!!.`val`)
        } else {
            sb.append(separator)
            sb.append("null")
        }
        count++
        if (limit != -1 && count > limit) {
            sb.append(truncated)
            break
        }

    }
    while (sb.endsWith(", null")) {
        sb.delete(sb.lastIndex - 5, sb.lastIndex + 1)
    }
    sb.append(postfix)
    return sb.toString()
}