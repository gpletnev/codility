package leetcode.challenge.`2021`.`03`.week5

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/flip-binary-tree-to-match-preorder-traversal/
fun flipMatchVoyage(root: TreeNode?, voyage: IntArray): List<Int> {
    val res = mutableListOf<Int>()
    var i = 0
    val s = Stack<TreeNode?>()
    s.push(root)
    while (s.size > 0) {
        val node = s.pop() ?: continue
        if (node.`val` != voyage[i++]) return listOf(-1)
        if (node.right != null && node.right!!.`val` == voyage[i]) {
            if (node.left != null) res.add(node.`val`)
            s.push(node.left)
            s.push(node.right)
        } else {
            s.push(node.right)
            s.push(node.left)
        }
    }
    return res
}