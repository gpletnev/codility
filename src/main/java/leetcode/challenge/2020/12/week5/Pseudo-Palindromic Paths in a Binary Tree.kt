package leetcode.challenge.`2020`.`12`.week5

import leetcode.TreeNode
import java.util.*

// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/
fun pseudoPalindromicPaths(root: TreeNode?): Int {
    var count = 0
    var path: Int
    val stack: Deque<Pair<TreeNode?, Int>> = LinkedList()
    stack.push(Pair(root, 0))
    while (!stack.isEmpty()) {
        val p = stack.pop()
        val node = p.first
        path = p.second
        if (node != null) {
            // compute occurrences of each digit
            // in the corresponding register
            path = path xor (1 shl node.`val`)
            // if it's a leaf check if the path is pseudo-palindromic
            if (node.left == null && node.right == null) {
                // check if at most one digit has an odd frequency
                if (path and path - 1 == 0) {
                    ++count
                }
            } else {
                stack.push(Pair(node.right, path))
                stack.push(Pair(node.left, path))
            }
        }
    }
    return count
}