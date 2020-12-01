package leetcode.challenge.`2020`.`12`.week1

import leetcode.TreeNode
import kotlin.math.max

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
fun maxDepth(root: TreeNode?): Int {
    return if (root == null) 0 else max(maxDepth(root.left), maxDepth(root.right)) + 1
}

/*
fun maxDepth(root: TreeNode?): Int {
    if (root == null) return 0

    val queue: Deque<TreeNode?> = LinkedList()
    queue.offer(root)
    var count = 0
    while (!queue.isEmpty()) {
        var size = queue.size
        while (size-- > 0) {
            val node = queue.poll()
            if (node!!.left != null) {
                queue.offer(node.left)
            }
            if (node.right != null) {
                queue.offer(node.right)
            }
        }
        count++
    }
    return count
}*/
