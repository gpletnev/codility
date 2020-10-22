package leetcode.challenge.`2020`.`10`.week4

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
fun minDepth(root: TreeNode?): Int {
    if (root == null) return 0

    var depth = 1
    val queue: Queue<TreeNode?> = LinkedList()
    queue.offer(root)
    while (!queue.isEmpty()) {
        val size = queue.size
        // for each level
        for (i in 0 until size) {
            val node = queue.poll()
            if (node!!.left == null && node.right == null) {
                return depth
            }
            if (node.left != null) {
                queue.offer(node.left)
            }
            if (node.right != null) {
                queue.offer(node.right)
            }
        }
        depth++
    }
    return depth
}