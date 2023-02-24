package leetcode.easy.tree

import leetcode.TreeNode

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return sortedArrayToBST(nums, 0, nums.lastIndex)
}

fun sortedArrayToBST(nums: IntArray, left: Int, right: Int) : TreeNode? {
    if (left > right)
        return null

    val mid = (left + right) / 2

    return TreeNode(nums[mid]).apply {
        this.left = sortedArrayToBST(nums, left, mid - 1)
        this.right = sortedArrayToBST(nums, mid + 1, right)
    }
}