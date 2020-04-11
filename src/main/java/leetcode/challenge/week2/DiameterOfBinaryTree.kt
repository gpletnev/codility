package leetcode.challenge.week2

// https://leetcode.com/problems/diameter-of-binary-tree
object DiameterOfBinaryTree {
    var diameter = 0
    private fun maxHeight(root: TreeNode?): Int {
        if (root == null) return 0
        val left = maxHeight(root.left)
        val right = maxHeight(root.right)
        diameter = Math.max(left + right, diameter)
        return Math.max(left, right) + 1
    }

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        maxHeight(root)
        return diameter
    }
}

class TreeNode {
    val left: TreeNode? = null
    val right: TreeNode? = null
}
