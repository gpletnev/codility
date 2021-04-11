package leetcode.challenge.`2021`.`04`.week2

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/deepest-leaves-sum/
fun deepestLeavesSum(root: TreeNode?): Int {
    var res = 0
    var i: Int
    val q = LinkedList<TreeNode>()
    q.add(root!!)
    while (!q.isEmpty()) {
        i = q.size - 1
        res = 0
        while (i >= 0) {
            val node: TreeNode = q.poll()
            res += node.`val`
            if (node.right != null) q.add(node.right!!)
            if (node.left != null) q.add(node.left!!)
            --i
        }
    }
    return res
}