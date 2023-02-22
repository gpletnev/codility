package leetcode.medium

import leetcode.TreeNode

// https://leetcode.com/problems/path-sum-iii/
object PathSumIII {
    fun pathSum(root: TreeNode?, targetSum: Int): Int {
        val map = hashMapOf(0L to 1)

        fun dfs(root: TreeNode?, path: Long): Int {
            if (root == null) return 0

            val sum = path + root.`val`
            var count = map[sum - targetSum] ?: 0

            map[sum] = (map[sum] ?: 0) + 1
            count += dfs(root.left, sum) + dfs(root.right, sum)
            map[sum] = map[sum]!! - 1

            return count
        }

        return dfs(root, 0)
    }
}