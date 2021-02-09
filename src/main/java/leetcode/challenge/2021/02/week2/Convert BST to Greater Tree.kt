package leetcode.challenge.`2021`.`02`.week2

import leetcode.TreeNode

// https://leetcode.com/problems/convert-bst-to-greater-tree/
fun convertBST(root: TreeNode?): TreeNode? {
    var sum = 0
    var node = root
    while (node != null) {
        // If there is no right subtree, then we can visit this node and continue traversing left.
        if (node.right == null) {
            sum += node.`val`
            node.`val` = sum
            node = node.left
        } else {
            val succ = getSuccessor(node)
            // If the left subtree is null, then we have never been here before.
            if (succ.left == null) {
                succ.left = node
                node = node.right
            } else {
                succ.left = null
                sum += node.`val`
                node.`val` = sum
                node = node.left
            }
        }
    }
    return root
}

// Get the node with the smallest value greater than this one.
fun getSuccessor(node: TreeNode): TreeNode {
    var succ = node.right
    while (succ?.left != null && succ.left != node) {
        succ = succ.left
    }
    return succ!!
}
