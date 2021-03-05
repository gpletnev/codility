package leetcode.challenge.`2021`.`03`.week1

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
fun averageOfLevels(root: TreeNode?): DoubleArray {
    val result = mutableListOf<Double>()
    val q: Queue<TreeNode?> = LinkedList()

    if (root == null) return result.toDoubleArray()
    q.add(root)
    while (!q.isEmpty()) {
        val n = q.size
        var sum = 0.0
        for (i in 0 until n) {
            val node = q.poll()
            sum += node!!.`val`
            if (node.left != null) q.offer(node.left)
            if (node.right != null) q.offer(node.right)
        }
        result.add(sum / n)
    }
    return result.toDoubleArray()
}