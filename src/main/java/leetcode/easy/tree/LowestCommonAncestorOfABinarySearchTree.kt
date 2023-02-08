package leetcode.easy.tree

import leetcode.TreeNode

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode {
    var node: TreeNode = root!!
    while (true) {
        node = when {
            node.`val` > p!!.`val` && node.`val` > q!!.`val` -> node.left!!
            node.`val` < p.`val` && node.`val` < q!!.`val` -> node.right!!
            else -> return node
        }
    }
}