package leetcode.challenge.`2020`.`04`.week5

import leetcode.TreeNode

// https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/532/week-5/3315/
object CheckIfAStringIsAValidSequenceFromRootToLeavesPathInABinaryTree {
    fun isValidSequence(root: TreeNode?, arr: IntArray): Boolean {
        return isValidSequence(root, arr, 0)
    }

    private fun isValidSequence(root: TreeNode?, arr: IntArray, i: Int): Boolean {
        if (root == null)
            return arr.isEmpty()
        else
            if ((root.left == null && root.right == null)) {
                return (i == arr.lastIndex && root.`val` == arr[i])
            }

        return i <= arr.lastIndex && (root.`val` == arr[i] && (isValidSequence(root.left, arr, i + 1) || isValidSequence(root.right, arr, i + 1)))
    }
}