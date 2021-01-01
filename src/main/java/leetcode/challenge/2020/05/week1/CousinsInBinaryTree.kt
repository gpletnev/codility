package leetcode.challenge.`2020`.`05`.week1

// 993. Cousins in Binary Tree
class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object CousinsInBinaryTree {
    var xDepth = 0
    var yDepth = 0

    fun isCousins(root: TreeNode?, x: Int, y: Int): Boolean {

        val xNodePair = find(root, x, 0)
        val yNodePair = find(root, y, 0)

        return if (xNodePair == null || yNodePair == null) return false
        else xNodePair.first != yNodePair.first && xNodePair.second == yNodePair.second
    }

    private fun find(root: TreeNode?, x: Int, depth: Int): Pair<TreeNode, Int>? {
        if (root == null || (xDepth != 0 && depth > xDepth) || (yDepth != 0 && depth > yDepth))
            return null
        else {
            if (root.left != null && root.left?.`val` == x) {
                xDepth = depth
                return Pair(root, depth)
            }
            if (root.right != null && root.right?.`val` == x) return Pair(root, depth)

            val leftFind = find(root.left, x, depth + 1)
            val rightFind = find(root.right, x, depth + 1)
            if (leftFind != null) return leftFind
            if (rightFind != null) return rightFind
            return null
        }
    }
}
