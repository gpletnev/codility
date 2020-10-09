package leetcode.challenge.`2020`.`10`.week2

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/serialize-and-deserialize-bst/
class Codec() {

    // Encodes a tree to a shortened URL.
    fun serialize(root: TreeNode?): String {
        val stringBuilder = StringBuilder()
        serialize(root, stringBuilder)
        return stringBuilder.trimEnd(',').toString()
    }

    private fun serialize(root: TreeNode?, stringBuilder: StringBuilder) {
        if (root == null) return
        stringBuilder.append(root.`val`).append(",")
        serialize(root.left, stringBuilder)
        serialize(root.right, stringBuilder)
    }

    // Decodes your encoded data to tree.
    fun deserialize(data: String): TreeNode? {
        if (data.isEmpty()) return null
        val queue: Queue<String> = LinkedList(data.split(","))
        return deserialize(queue, Int.MIN_VALUE, Int.MAX_VALUE)
    }

    private fun deserialize(queue: Queue<String>, lower: Int, upper: Int): TreeNode? {
        if (queue.isEmpty()) return null

        val s = queue.peek()
        val `val` = s.toInt()
        if (`val` < lower || `val` > upper) return null

        queue.poll()
        val root = TreeNode(`val`)
        root.left = deserialize(queue, lower, `val`)
        root.right = deserialize(queue, `val`, upper)
        return root
    }
}
