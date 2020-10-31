package leetcode.challenge.`2020`.`10`.week5

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/recover-binary-search-tree
fun recoverTree(_root: TreeNode?): Unit {
    var root = _root
    var pre: TreeNode? = null
    var first: TreeNode? = null
    var second: TreeNode? = null
    val stack: Deque<TreeNode> = LinkedList()

    while (root != null) {
        stack.push(root)
        root = root.left
    }
    while (!stack.isEmpty()) {
        var temp = stack.pop()
        if (pre != null)
            if (pre.`val` > temp!!.`val`) {
                if (first == null) first = pre
                second = temp
            }
        pre = temp
        if (temp!!.right != null) {
            temp = temp.right
            while (temp != null) {
                stack.push(temp)
                temp = temp.left
            }
        }
    }

    val temp = first!!.`val`
    first.`val` = second!!.`val`
    second.`val` = temp
}