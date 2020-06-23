package leetcode.challenge.june2020.week4

// https://leetcode.com/problems/count-complete-tree-nodes/

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object CountCompleteTreeNodes {
    fun countNodes(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val l = leftHeight(root.left)
        val r = leftHeight(root.right)
        return if (l == r) { // left side is full
            countNodes(root.right) + (1 shl l)
        } else countNodes(root.left) + (1 shl r)
    }

    private fun leftHeight(node: TreeNode?): Int {
        var n = node
        var h = 0
        while (n != null) {
            h++
            n = n.left
        }
        return h
    }
}