package leetcode.challenge.`2020`.`06`.week1

import java.util.*


// https://leetcode.com/problems/invert-binary-tree/
object InvertBinaryTree {
    /*   fun invertTree(root: TreeNode?): TreeNode? {
           if (root != null) {
               val right = invertTree(root.right)
               val left = invertTree(root.left)
               root.left = right
               root.right = left
           }
           return root
       }*/

    fun invertTree(root: TreeNode?): TreeNode? {
        if (root == null) return null
        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)
        while (queue.isNotEmpty()) {
            val current = queue.poll()
            current.left = current.right.also { current.right = current.left }
            current.left?.let { queue.add(current.left) }
            current.right?.let { queue.add(current.right) }
        }
        return root
    }
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}