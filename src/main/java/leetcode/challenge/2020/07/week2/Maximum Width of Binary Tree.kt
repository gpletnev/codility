package leetcode.challenge.`2020`.`07`.week2

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/maximum-width-of-binary-tree/
fun widthOfBinaryTree(root: TreeNode?): Int {
    if (root == null) return 0
    val q = LinkedList<TreeNode?>()
    q.add(root)
    var max = 0
    while (!q.isEmpty()) {
        var count = 0
        max = maxOf(max, q.size)
        val size = q.size
        while (count < size) {
            val node = q.poll()
            if (node == null) {
                q.add(null)
                q.add(null)
            } else {
                q.add(node.left)
                q.add(node.right)
            }
            count++
        }
        while (!q.isEmpty() && q.peekFirst() == null) q.pollFirst()
        while (!q.isEmpty() && q.peekLast() == null) q.pollLast()
    }
    return max
}