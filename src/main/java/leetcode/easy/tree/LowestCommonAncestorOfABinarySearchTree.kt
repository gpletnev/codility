package leetcode.easy.tree

import leetcode.TreeNode

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    var root: TreeNode = root!!
    while (true) {
        root =
            if (root.`val` > p!!.`val` && root.`val` > q!!.`val`) root.left!! else if (root.`val` < p.`val` && root.`val` < q!!.`val`) root.right!! else return root
    }
}