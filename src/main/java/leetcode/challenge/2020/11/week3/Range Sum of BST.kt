package leetcode.challenge.`2020`.`11`.week3

import leetcode.TreeNode

// https://leetcode.com/problems/range-sum-of-bst/

/*fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    var sum = 0
    val stack: Stack<TreeNode?> = Stack()
    stack.push(root)
    while (!stack.isEmpty()) {
        val node = stack.pop()
        if (node != null) {
            if (node.`val` in low..high) sum += node.`val`
            if (low < node.`val`) stack.push(node.left)
            if (node.`val` < high) stack.push(node.right)
        }
    }
    return sum
}*/

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
    var sum = 0

    if (root == null) return sum

    if (root.`val` in low..high) sum += root.`val`
    if (root.`val` > low) sum += rangeSumBST(root.left, low, high)
    if (root.`val` < high) sum += rangeSumBST(root.right, low, high)

    return sum
}