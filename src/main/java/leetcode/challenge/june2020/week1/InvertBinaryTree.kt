package leetcode.challenge.june2020.week1

// https://leetcode.com/problems/invert-binary-tree/
object InvertBinaryTree {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root != null) {
            val right = invertTree(root.right)
            val left = invertTree(root.left)
            root.left = right
            root.right = left
        }
        return root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}