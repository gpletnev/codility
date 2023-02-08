package leetcode.challenge.`2020`.`12`.week3

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/validate-binary-search-tree/
fun isValidBST(root: TreeNode?): Boolean {

    if (root == null) return true
    var node = root

    val stack: Stack<TreeNode> = Stack()
    var pre: TreeNode? = null
    while (node != null || stack.isNotEmpty()) {
        while (node != null) {
            stack.push(node)
            node = node.left
        }
        node = stack.pop()
        if (pre != null && node.`val` <= pre.`val`) return false
        pre = node
        node = node.right
    }
    return true
//    return isValidBST(root, null, null)
}

fun isValidBST(root: TreeNode?, min: Int?, max: Int?): Boolean {
    if (root != null) {
        if (min != null && root.`val` <= min) return false
        if (max != null && root.`val` >= max) return false
        return isValidBST(root.left, min, root.`val`) && isValidBST(root.right, root.`val`, max)
    }
    return true
}