package leetcode.challenge.`2020`.`11`.week4

// https://leetcode.com/problems/partition-equal-subset-sum/
fun canPartition(nums: IntArray): Boolean {
    if (nums.isEmpty()) return false

    val totalSum = nums.sum()
    // if totalSum is odd,it cannot be partitioned into equal sum subset
    if (totalSum % 2 != 0) return false

    val subSetSum = totalSum / 2
    val dp = BooleanArray(subSetSum + 1)
    dp[0] = true
    for (curr in nums) {
        for (j in subSetSum downTo curr) {
            dp[j] = dp[j] or dp[j - curr]
        }
    }
    return dp[subSetSum]
}